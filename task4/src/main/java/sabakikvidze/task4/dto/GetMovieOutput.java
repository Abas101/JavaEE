package sabakikvidze.task4.dto;

import lombok.Data;
import sabakikvidze.task4.model.Category;

import java.util.List;

@Data
public class GetMovieOutput {
    private String title;
    private String country;
    private byte[] data;
    private List<Category> categories;
}
