package filmProdApp.classes;

import filmProdApp.FilmProductionApplication;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilmList {
    public ArrayList<Film> listOfFilms;

    public FilmList(){
        this.listOfFilms = new ArrayList<Film>();
    }

    public void addFilm(Film film){
        this.listOfFilms.add(film);
    }

    public JSONArray FilmListAsJson() throws JSONException {
        JSONArray filmListJson = new JSONArray();
        for (Film film: this.listOfFilms) {
            filmListJson.put(film.FilmAsJson());
        }
        return filmListJson;
    }

    public JSONArray FilmListAsJson(ArrayList<Film> filmList) throws JSONException {
        JSONArray filmListJson = new JSONArray();
        for (Film film: filmList) {
            filmListJson.put(film.FilmAsJson());
        }
        return filmListJson;
    }



    public JSONArray searchFilmsByString(String searchString) throws JSONException {
        ArrayList<Film> listOfFilms = new ArrayList<>();

        for (Film film:this.listOfFilms) {
            //searching for ID
            if (Integer.toString(film.id).contains(searchString)){
                listOfFilms.add(film);
                continue;
            }
            //searching for title
            if (film.name.contains(searchString)){
                listOfFilms.add(film);
                continue;
            }
            //searching for year
            if (Integer.toString(film.yearOfRelease).contains(searchString)){
                listOfFilms.add(film);
                continue;
            }
            //searching for director
            if (film.director.contains(searchString)){
                listOfFilms.add(film);
            }
        }
    return FilmListAsJson(listOfFilms);
    }
}
