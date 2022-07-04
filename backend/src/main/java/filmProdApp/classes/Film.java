package filmProdApp.classes;

import filmProdApp.FilmProductionApplication;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Film {
    public Integer id;
    public String name;
    public  Integer yearOfRelease;
    public  String director;
    public  Double rating;

    public Film(String name, Integer yearOfRelease, String director, Double rating){
        this.id = newId();
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.rating = rating;

    }
    public JSONObject FilmAsJson() throws JSONException {
        JSONObject filmJson = new JSONObject();
        filmJson.put("ID",this.id);
        filmJson.put("Name",this.name);
        filmJson.put("yearOfRelease",this.yearOfRelease);
        filmJson.put("director",this.director);
        filmJson.put("rating",this.rating);
        return filmJson;
    }

    private int newId(){
        List<Integer> listOfIds = FilmProductionApplication.filmList.listOfFilms.stream().map(film -> film.id).collect(Collectors.toList());
        return listOfIds.size() == 0 ? 0 : Collections.max(listOfIds) + 1;
    }
}
