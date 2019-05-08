import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

class MyVisitor extends MyGrammarBaseVisitor<Value>
{
    int numberToAdd =0;
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[35m";
    Map<String,Value> variables = new HashMap<String, Value>();
    @Override
    public Value visitTerminal(TerminalNode node)
    {
        System.err.println(ANSI_CYAN_BACKGROUND+"[" + node.getText() + "]");
        return (new Value (node.getText()));
    }

    @Override
    public Value visitNumberDeclaration(MyGrammarParser.NumberDeclarationContext ctx)
    {
        numberToAdd= Integer.parseInt(ctx.NUMBER().getText());
        return new Value(ctx.NUMBER().getText());
    }
    @Override
    public Value visitCoordinate(MyGrammarParser.CoordinateContext ctx)
    {
        return visitChildren(ctx);
    }
    @Override
    public Value visitFunctionDefine(MyGrammarParser.FunctionDefineContext ctx)
    {
       //Value value =visit(
      //  Value debug= value;
        return null;
    }

    public void processCoordinate(String coordinate, int number)
    {
        int x = Character.getNumericValue(coordinate.charAt(1));
        int y = Character.getNumericValue(coordinate.charAt(2));
        System.out.printf("should place int"+number+" "+x+" "+y+" a");
    }
}