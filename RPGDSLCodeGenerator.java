import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class RPGDSLCodeGenerator {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        RPGDSLLexer lexer = new RPGDSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RPGDSLParser parser = new RPGDSLParser(tokens);
        ParseTree tree = parser.input();

        RPGDSLVisitor<String> visitor = new RPGDSLBaseVisitor<String>() {
            @Override
            public String visitInput(RPGDSLParser.InputContext ctx) {
                String output = "";

                for (RPGDSLParser.ClassDeclarationContext classDecl : ctx.classDeclaration()) {
                    String className = classDecl.className.getText();
                    String classDescription = classDecl.description != null ? classDecl.description.getText() : "";

                    output += String.format("public class %s {\n", className);
                    output += String.format("\t// Description: %s\n", classDescription);
                    output += "\tprivate int vida;\n";
                    output += "\tprivate int mana;\n";

                    output += "\n\t// Items\n";
                    for (RPGDSLParser.ItemDeclarationContext itemDecl : classDecl.itemDeclaration()) {
                        String itemName = itemDecl.itemName.getText();
                        int itemDamage = Integer.parseInt(itemDecl.itemDamage.getText());
                        output += String.format("\tprivate int %sDamage = %d;\n", itemName, itemDamage);
                    }

                    output += "\n\t// Actions\n";
                    for (RPGDSLParser.ActionDeclarationContext actionDecl : classDecl.actionDeclaration()) {
                        String actionName = actionDecl.actionName.getText();
                        String actionDamage = actionDecl.damage != null ? actionDecl.damage.getText() : "0";
                        output += String.format("\tpublic void %s() {\n", actionName);
                        output += String.format("\t\tSystem.out.println(\"%s dealt %s damage!\");\n", actionName, actionDamage);
                        output += "\t}\n";
                    }

                    output += "}\n\n";
                }

                return output;
            }
        };

        System.out.print(visitor.visit(tree));
    }
}
