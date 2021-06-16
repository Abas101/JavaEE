package sabakikvidze.task4.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetCategoriesOutput {
    private List<CategoryDTO> categories;
}
