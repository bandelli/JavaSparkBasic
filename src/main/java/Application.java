public class Application {

    public static void main(String[] args) {
/*        InferCSVSchema parser = new InferCSVSchema();
        parser.printSchema();*/

        //DefineCSVSchema define = new DefineCSVSchema();
        //define.printDefinedSchema();

        JSONLinesParser jsonLine = new JSONLinesParser();
        jsonLine.parseLinesParse();


    }
}
