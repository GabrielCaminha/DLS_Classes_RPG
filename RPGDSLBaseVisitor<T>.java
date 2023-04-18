import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class RPGDSLBaseVisitor extends RPGDSLParserBaseVisitor<Void> {

    @Override
    public Void visitClassDeclaration(RPGDSLParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public Void visitAttributeDeclaration(RPGDSLParser.AttributeDeclarationContext ctx) {
        return null;
    }

    @Override
    public Void visitItemDeclaration(RPGDSLParser.ItemDeclarationContext ctx) {
        return null;
    }

    @Override
    public Void visitActionDeclaration(RPGDSLParser.ActionDeclarationContext ctx) {
        return null;
    }

    @Override
    public Void visitStatement(RPGDSLParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Void visitRollStatement(RPGDSLParser.RollStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitFunctionCall(RPGDSLParser.FunctionCallContext ctx) {
        return null;
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Void visitChildren(@NotNull RuleNode node) {
        int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            ParseTree c = node.getChild(i);
            if (c instanceof RuleNode) {
                ((RuleNode) c).accept(this);
            }
            else if (c instanceof TerminalNode) {
                visitTerminal((TerminalNode) c);
            }
        }
        return null;
    }
}
