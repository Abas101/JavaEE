package sabakikvidze.task4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sabakikvidze.task4.dto.*;
import sabakikvidze.task4.model.Movie;
import sabakikvidze.task4.respository.MovieRepo;
import sabakikvidze.task4.service.MovieService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepo movieRepo;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) throws IOException {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        movie.setCategories(addMovieInput.getCategories());
        movie.setData(addMovieInput.getData().getBytes());

        movieRepo.save(movie);

        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setMsg("Success!");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Optional<Movie> movie = movieRepo.findById(deleteMovieInput.getId());
        movie.ifPresent(value -> movieRepo.delete(value));
        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("Deletion Success!");
        return deleteMovieOutput;
    }

    @Override
    public GetMoviesOutput getMovies() {
        List<MovieDTO> movies = new ArrayList<>();
        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        for (Movie movie : movieRepo.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTO.setCategories(movie.getCategories());
            movieDTO.setData(movie.getData());
            movies.add(movieDTO);
        }

        getMoviesOutput.setMovies(movies);

        return getMoviesOutput;

    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepo.getById(getMovieInput.getId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());
        getMovieOutput.setCategories(movie.getCategories());
        getMovieOutput.setData(movie.getData());

        return getMovieOutput;

    }
}
