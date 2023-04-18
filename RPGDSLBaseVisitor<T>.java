import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

public class RPGDSLBaseVisitor<T> extends RPGDSLParserBaseVisitor<T> {

    @Override
    public T visitClassDeclaration(@NotNull RPGDSLParser.ClassDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAttributeDeclaration(@NotNull RPGDSLParser.AttributeDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitItemDeclaration(@NotNull RPGDSLParser.ItemDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitActionDeclaration(@NotNull RPGDSLParser.ActionDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTerminal(@NotNull TerminalNode node) {
        return null;
    }
}
