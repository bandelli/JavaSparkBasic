import org.apache.log4j.Logger;
import org.apache.log4j.Level;
public class Application {

    public static void main(String[] args) {
        Logger.getLogger("org").setLevel(Level.ERROR);
        Logger.getLogger("akka").setLevel(Level.ERROR);

/*        InferCSVSchema parser = new InferCSVSchema();
        parser.printSchema();*/

        //DefineCSVSchema define = new DefineCSVSchema();
        //define.printDefinedSchema();

        JSONLinesParser jsonLine = new JSONLinesParser();
        jsonLine.parseLinesParse();


    }
}
