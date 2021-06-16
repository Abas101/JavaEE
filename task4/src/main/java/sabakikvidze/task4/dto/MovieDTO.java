package sabakikvidze.task4.dto;

import lombok.Data;
import sabakikvidze.task4.model.Category;

import java.util.List;

@Data
public class MovieDTO {
    private Long id;
    private String title;
    private String country;
    private byte[] data;
    private List<Category> categories;
}
