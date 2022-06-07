package filmProdApp;

import filmProdApp.classes.Film;
import filmProdApp.classes.FilmList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmProductieApplication {

    static public FilmList filmList = new FilmList();

    public static void main(String[] args) {
        SpringApplication.run(FilmProductieApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            //Initializing Film database
            //todo nog meer films toevoegen
            System.out.println("SPRING BOOT server started and listening on port 8080....");
            filmList.addFilm(new Film(1,"Rambo", 2008, "Sylvester Stallone",7.0));
            filmList.addFilm(new Film(2,"The Shawshank Redemption", 1994, "Frank Darabont",9.3));
            filmList.addFilm(new Film(3,"The Lord of the Rings: The Return of the King ", 2003, "Peter Jackson",9.0));

        };
    };
}

