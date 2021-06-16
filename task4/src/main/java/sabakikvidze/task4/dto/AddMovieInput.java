package sabakikvidze.task4.dto;

import lombok.Data;
import sabakikvidze.task4.model.Category;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class AddMovieInput {
    private String title;
    private String Country;
    private MultipartFile data;

    private List<Category> categories;
}
