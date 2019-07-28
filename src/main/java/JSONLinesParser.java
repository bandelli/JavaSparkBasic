import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class JSONLinesParser {

    public void parseLinesParse(){
        SparkSession spark = SparkSession.builder()
                .appName("JSON em Dataframe")
                .master("local")
                .getOrCreate();

        //	    Dataset<Row> df = spark.read().format("json")
        //		        .load("src/main/resources/simple.json");

        //multiline
        Dataset<Row> df = spark.read().format("json")
                .option("multiline", true)
                .load("src/main/resources/multiline.json");

        df.show(5, 150);
        df.printSchema();
    }
}
