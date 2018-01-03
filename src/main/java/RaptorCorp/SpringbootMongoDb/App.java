package RaptorCorp.SpringbootMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="RaptorCorp.SpringbootMongoDb")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println("This is a test for checking out Spring boot");
    }
}
