package filmProdApp.classes;

import filmProdApp.FilmProductionApplication;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
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
            if(film !=  null) {
                filmListJson.put(film.FilmAsJson());
            }
        }
        return filmListJson;
    }



    public JSONArray searchFilmsByString(String searchString) throws JSONException {
        ArrayList<Film> listOfFilms = new ArrayList<>();

        for (Film film:this.listOfFilms) {
            //searching for ID
            if (Integer.toString(film.id).contains(searchString)){
                listOfFilms.add(film);
            }
            //searching for title
            else if (film.name.toLowerCase().contains(searchString)){
                listOfFilms.add(film);
            }
            //searching for year
            else if (Integer.toString(film.yearOfRelease).contains(searchString)){
                listOfFilms.add(film);
            }
            //searching for director
            else if (film.director.toLowerCase().contains(searchString)){
                listOfFilms.add(film);
            }
        }

    return FilmListAsJson(listOfFilms);
    }

    public JSONArray searchFilmsByParameters(Map<String, String> paramaters) throws JSONException {
        ArrayList<Film> matchingFilms = new ArrayList<>();
        for (String key: paramaters.keySet()){
            switch (key.toLowerCase()) {
                case "id" -> matchingFilms.addAll(searchFilmsById(paramaters.get(key)));
                case "name" -> matchingFilms.addAll(searchFilmsByName(paramaters.get(key)));
                case "yearofrelease" -> matchingFilms.addAll(searchFilmsByYearOfRelease(paramaters.get(key)));
                case "director" -> matchingFilms.addAll(searchFilmsByDirector(paramaters.get(key)));
            }
        }
        //delete doubles
        matchingFilms = (ArrayList<Film>) matchingFilms.stream().distinct().collect(Collectors.toList());
        return FilmListAsJson(matchingFilms);
    }

    public ArrayList<Film> searchFilmsById(String id) {
        return (ArrayList<Film>) FilmProductionApplication.filmList.listOfFilms.stream()
                .filter(film -> Integer.toString(film.id).contains(id))
                .collect(Collectors.toList());
    }

    public ArrayList<Film> searchFilmsByName(String name) {
        return (ArrayList<Film>) FilmProductionApplication.filmList.listOfFilms.stream()
                .filter(film -> film.name.toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public ArrayList<Film> searchFilmsByDirector(String director) {
        return (ArrayList<Film>) FilmProductionApplication.filmList.listOfFilms.stream()
                .filter(film -> film.director.toLowerCase().contains(director.toLowerCase()))
                .collect(Collectors.toList());
    }

    public ArrayList<Film> searchFilmsByYearOfRelease(String YearOfRelease) {
        return (ArrayList<Film>) FilmProductionApplication.filmList.listOfFilms.stream()
                .filter(film -> Integer.toString(film.yearOfRelease).contains(YearOfRelease))
                .collect(Collectors.toList());
    }

}
