package filmProdApp.controller;
import filmProdApp.FilmProductionApplication;
import filmProdApp.classes.Film;
import org.json.JSONException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;


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
        return FilmProductionApplication.filmList.searchFilmsByString(searchString.toLowerCase()).toString();
}

    @RequestMapping(value = {"/search/", "/search"}, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String SearchForMovies(@RequestParam Map<String, String> allRequestParams) throws JSONException {
        return FilmProductionApplication.filmList.searchFilmsByParameters(allRequestParams).toString();
    }
}


