package filmProdApp.controller;

import filmProdApp.FilmProductionApplication;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;


import java.util.Map;


@RestController
@RequestMapping()
public class filmController {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/all", produces = "application/json")
    @ResponseBody
    public String ShowAllMovies() throws JSONException {
        return FilmProductionApplication.filmList.FilmListAsJson().toString();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/search/{searchString}", produces = "application/json")
    @ResponseBody
    public String SearchForMovies(@PathVariable(value = "searchString") String searchString) throws JSONException {
        return FilmProductionApplication.filmList.searchFilmsByString(searchString.toLowerCase()).toString();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = {"/search/", "/search"}, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String SearchForMovies(@RequestParam Map<String, String> allRequestParams) throws JSONException {
        return FilmProductionApplication.filmList.searchFilmsByParameters(allRequestParams).toString();
    }
}


