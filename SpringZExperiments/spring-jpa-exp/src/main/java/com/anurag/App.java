package com.anurag;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
//@ImportResource(value = "config.xml")
public class App {
    public static void main( String[] args )  {

        SpringApplication.run(App.class);



    }
}
