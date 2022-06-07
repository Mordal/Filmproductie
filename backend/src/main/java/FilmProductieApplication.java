import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmProductieApplication {


    public static void main(String[] args) {
        SpringApplication.run(FilmProductieApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            //Initializing Film database
            System.out.println("Starting SPRING BOOT server");


        };
    };
}

