import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class InferCSVSchema {

    public void printSchema(){
        SparkSession spark = SparkSession.builder()
                .appName("Carrega Dataframe")
                .master("local")
                .getOrCreate();

        Dataset<Row> df = spark.read().format("csv")
                .option("header" , "true")
                .option("multiline" , true)
                .option("sep", ";")
                .option("quote", "^")
                .option("dateformat", "M/d/y")
                .option("inferSchema", true)
                .load("src/main/resources/amazonProducts.txt");

        System.out.println("Parte do conteudo do dataframe");
        df.show(7, 50);
        System.out.println("Datrafame 's schema");
        df.printSchema();

    }
}
