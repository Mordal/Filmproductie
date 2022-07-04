package filmProdApp.controller;
import filmProdApp.FilmProductionApplication;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping()
public class filmController {
    @GetMapping(path = "/all", produces = "application/json")
    @ResponseBody
    public String ShowAllMovies() throws JSONException {
        return FilmProductionApplication.filmList.FilmListAsJson().toString();
    }

    @GetMapping(path = "/search/{searchString}", produces = "application/json")
    @ResponseBody
    public String SearchForMovies(@PathVariable(value = "searchString") String searchString) throws JSONException {
        return FilmProductionApplication.filmList.searchFilmsByString(searchString).toString();
}

}


