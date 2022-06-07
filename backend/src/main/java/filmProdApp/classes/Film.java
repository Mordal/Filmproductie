package filmProdApp.classes;

import org.json.JSONException;
import org.json.JSONObject;

public class Film {
    public Integer id;
    public String name;
    public  Integer yearOfRelease;
    public  String director;
    public  Double rating;

    public Film(Integer id, String name, Integer yearOfRelease, String director, Double rating){
        this.id = id;
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

    public JSONObject FilmAsJson(Film film) throws JSONException {
        JSONObject filmJson = new JSONObject();
        filmJson.put("ID",film.id);
        filmJson.put("Name",film.name);
        filmJson.put("yearOfRelease",film.yearOfRelease);
        filmJson.put("director",film.director);
        filmJson.put("rating",film.rating);
        return filmJson;
    }

}
