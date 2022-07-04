package filmProdApp;

import filmProdApp.classes.Film;
import filmProdApp.classes.FilmList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmProductionApplication {
    //This filmList contains the complete film library
    static public FilmList filmList = new FilmList();

    public static void main(String[] args) {
        SpringApplication.run(FilmProductionApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            //Initializing Film database
            System.out.println("SPRING BOOT server started and listening on port 8080....");
            filmList.addFilm(new Film("Rambo", 2008, "Sylvester Stallone",7.0));
            filmList.addFilm(new Film("The Shawshank Redemption", 1994, "Frank Darabont",9.3));
            filmList.addFilm(new Film("The Lord of the Rings: The Return of the King ", 2003, "Peter Jackson",9.0));
            filmList.addFilm(new Film("Top Gun: Maverick", 2022, "Joseph Kosinski",8.6));
            filmList.addFilm(new Film("The Dark Knight", 2008, "Christopher Nolan",9.0));
            //todo: nog meer films toevoegen
        };
    }
}

