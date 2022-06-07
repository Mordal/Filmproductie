package filmProdApp.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping()
public class filmController {
    @GetMapping(path = "/all", produces = "application/json")
    @ResponseBody
    public String ShowAllMovies() {

        return "[RETURN TEST]";


    }
}


