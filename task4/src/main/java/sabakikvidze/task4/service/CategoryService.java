package sabakikvidze.task4.service;

import sabakikvidze.task4.dto.AddCategoryInput;
import sabakikvidze.task4.dto.AddCategoryOutput;
import sabakikvidze.task4.dto.GetCategoriesInput;
import sabakikvidze.task4.dto.GetCategoriesOutput;

public interface CategoryService {
    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);

    GetCategoriesOutput getCategories();
}
