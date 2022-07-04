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

//todo: POSTmapping handling met zoekstring


}


