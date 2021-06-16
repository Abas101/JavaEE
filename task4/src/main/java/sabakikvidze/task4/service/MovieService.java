package sabakikvidze.task4.service;

import sabakikvidze.task4.dto.*;

import java.io.IOException;

public interface MovieService {

    AddMovieOutput addMovie(AddMovieInput addMovieInput) throws IOException;

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetMoviesOutput getMovies();

    GetMovieOutput getMovie(GetMovieInput getMovieInput);

}
