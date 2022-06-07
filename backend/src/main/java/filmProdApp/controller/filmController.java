package filmProdApp.controller;
import filmProdApp.FilmProductieApplication;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping()
public class filmController {
    @GetMapping(path = "/all", produces = "application/json")
    @ResponseBody
    public String ShowAllMovies() throws JSONException {
        return FilmProductieApplication.filmList.AsJson().toString();
    }

//todo: POSTmapping handling met zoekstring


}


