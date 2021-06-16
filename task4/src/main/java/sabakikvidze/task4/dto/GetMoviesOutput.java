package sabakikvidze.task4.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movies;
}
