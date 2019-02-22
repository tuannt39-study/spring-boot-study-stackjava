package vn.teo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
//        Config Banner OFF
//        SpringApplication app = new SpringApplication(HelloApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(HelloApplication.class, args);
    }

}
