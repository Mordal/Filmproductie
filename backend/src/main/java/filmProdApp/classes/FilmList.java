package filmProdApp.classes;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class FilmList {
    public ArrayList<Film> listOfFilms;

    public FilmList(){
        this.listOfFilms = new ArrayList<Film>();
    }

    public void addFilm(Film film){
        this.listOfFilms.add(film);
    }

    public JSONArray AsJson() throws JSONException {
        JSONArray filmListJson = new JSONArray();
        for (Film film: this.listOfFilms) {
            filmListJson.put(film.AsJson());
        }
        return filmListJson;
    }
}
