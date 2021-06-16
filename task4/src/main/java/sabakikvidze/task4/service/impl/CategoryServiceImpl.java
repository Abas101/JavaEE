package sabakikvidze.task4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sabakikvidze.task4.dto.*;
import sabakikvidze.task4.model.Category;
import sabakikvidze.task4.respository.CategoryRepo;
import sabakikvidze.task4.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    @Override
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();

        category.setTitle(addCategoryInput.getTitle());

        categoryRepo.save(category);

        AddCategoryOutput addCategoryOutput = new AddCategoryOutput();
        addCategoryOutput.setMsg("Success!");
        return addCategoryOutput;
    }

    @Override
    public GetCategoriesOutput getCategories() {
        List<CategoryDTO> categories = new ArrayList<>();
        GetCategoriesOutput getCategoriesOutput = new GetCategoriesOutput();
        for (Category category : categoryRepo.findAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setTitle(category.getTitle());
            categories.add(categoryDTO);
        }

        getCategoriesOutput.setCategories(categories);

        return getCategoriesOutput;
    }
}
