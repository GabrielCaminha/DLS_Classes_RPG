import org.antlr.v4.runtime.tree.*;

public class CodeGenerator extends RPGDSLBaseVisitor<Void> {

    public void generate(ParseTree tree) {
        visit(tree);
    }

    @Override
    public Void visitClassDeclaration(RPGDSLParser.ClassDeclarationContext ctx) {
        String className = ctx.className.getText();
        String classDescription = ctx.description != null ? ctx.description.getText() : "";

        System.out.printf("public class %s {\n", className);
        System.out.printf("\tprivate String descricao = \"%s\";\n", classDescription);
        System.out.printf("\tprivate int vida = %s;\n", ctx.vida.getText());
        System.out.printf("\tprivate int mana = %s;\n", ctx.mana.getText());

        System.out.println("\n\t// Attributes");
        for (RPGDSLParser.AttributeDeclarationContext attrDecl : ctx.attributeDeclaration()) {
            String type = attrDecl.type.getText();
            String name = attrDecl.attributeName.getText();
            String amount = attrDecl.attributeAmoubt.getText();
            System.out.printf("\tprivate %s %s = %s;\n", type, name, amount);
        }

        System.out.println("\n\t// Items");
        for (RPGDSLParser.ItemDeclarationContext itemDecl : ctx.itemDeclaration()) {
            String itemName = ctx.itemName.getText();
            if (ctx.damage != null) {
                // item de dano
                int itemDamage = Integer.parseInt(ctx.damage.getText());
                System.out.printf("\tprivate int %sDamage = %d;\n", itemName, itemDamage);
            } else {
                // item de cura 
                int itemHealing = Integer.parseInt(ctx.healing.getText());
                System.out.printf("\tprivate int %sHealing = %d;\n", itemName, itemHealing);
    }
        }

        System.out.println("\n\t// Actions");
        for (RPGDSLParser.ActionDeclarationContext actionDecl : ctx.actionDeclaration()) {
            String actionName = actionDecl.actionName.getText();
            String returnType = actionDecl.returnType != null ? actionDecl.returnType.getText() : "void";
            String actionDamage = actionDecl.damage != null ? actionDecl.damage.getText() : "0";
            System.out.printf("\tpublic %s %s() {\n", returnType, actionName);
            System.out.printf("\t\tSystem.out.println(\"%s dealt %s damage!\");\n", actionName, actionDamage);
            System.out.println("\t}");
        }

        System.out.println("}\n");
        return null;
    }

}


