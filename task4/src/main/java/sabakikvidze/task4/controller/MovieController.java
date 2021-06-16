package sabakikvidze.task4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sabakikvidze.task4.service.MovieService;
import sabakikvidze.task4.dto.*;

import java.io.IOException;

@RestController
@RequestMapping("api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/getMovie")
    public GetMovieOutput getMovie(@RequestBody GetMovieInput getMovieInput) {
        return movieService.getMovie(getMovieInput);
    }

    @PostMapping("/getMovies")
    public GetMoviesOutput getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/addMovie")
    public AddMovieOutput addMovie(@RequestBody AddMovieInput addMovieInput) throws IOException {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("/deleteMovie")
    public DeleteMovieOutput deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }
}
