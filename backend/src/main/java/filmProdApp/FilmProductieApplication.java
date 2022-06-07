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

    public FilmList filmList = new FilmList();

    public static void main(String[] args) {
        SpringApplication.run(FilmProductieApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            //Initializing filmProdApp.classes.Film database
            System.out.println("Starting SPRING BOOT server");
            filmList.addFilm(new Film(1,"Rambo", 2008, "Sylvester Stallone",7.0));
            filmList.addFilm(new Film(2,"The Shawshank Redemption", 1994, "Frank Darabont",9.3));
            filmList.addFilm(new Film(2,"The Lord of the Rings: The Return of the King ", 2003, "Peter Jackson",9.0));

            System.out.println(filmList);

        };
    };
}

