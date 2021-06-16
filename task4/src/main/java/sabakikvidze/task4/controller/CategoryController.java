package sabakikvidze.task4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sabakikvidze.task4.dto.AddCategoryInput;
import sabakikvidze.task4.dto.AddCategoryOutput;
import sabakikvidze.task4.dto.GetCategoriesInput;
import sabakikvidze.task4.dto.GetCategoriesOutput;
import sabakikvidze.task4.service.CategoryService;

@RestController
@RequestMapping("api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/getCategories")
    public GetCategoriesOutput getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping("/addCategory")
    public AddCategoryOutput addCategory(@RequestBody AddCategoryInput addCategoryInput) {
        return categoryService.addCategory(addCategoryInput);
    }

}
