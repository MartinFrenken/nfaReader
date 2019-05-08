import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main  {

    public static void main(String[] args) throws IOException {
        String input="";
        String filePath = new File("src/main/java/com/company/input").getAbsolutePath();
       // filePath.concat("com/company/input");
        FileReader fileReader =
                new FileReader(filePath);
        BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        String line;
        StringBuilder fileLine= new StringBuilder();

        while((line = bufferedReader.readLine())!=null) {
            fileLine.append(line);
        }

        CharStream chartStream = CharStreams.fromString(fileLine.toString());
        MyGrammarLexer lexer = new MyGrammarLexer(chartStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        MyGrammarParser.MyStartContext startContext = parser.myStart();
        MyListener myListener = new MyListener();
        ParseTreeWalker.DEFAULT.walk(myListener,startContext);

    }
}
