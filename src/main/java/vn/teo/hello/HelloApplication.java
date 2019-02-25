package vn.teo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
//        Config Banner OFF
//        SpringApplication app = new SpringApplication(HelloApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(HelloApplication.class, args);

//		SpringApplication application = new SpringApplication(SpringBootProfilesApplication.class);
//		ConfigurableEnvironment environment = new StandardEnvironment();
//		environment.setActiveProfiles("prod","test");
//		application.setEnvironment(environment);
//		application.run(args);
    }

    @Bean
    @Profile("dev")
    public String dev() {
        System.out.println("++++++++++++++ dev environment");
        return "dev";
    }

    @Bean
    @Profile("prod")
    public String prod() {
        System.out.println("++++++++++++++ prod environment");
        return "prod";
    }

    @Bean
    @Profile("test")
    public String test() {
        System.out.println("++++++++++++++ test environment");
        return "test";
    }

}
