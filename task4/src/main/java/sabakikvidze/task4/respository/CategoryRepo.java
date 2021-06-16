package sabakikvidze.task4.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import sabakikvidze.task4.model.Category;

public interface CategoryRepo extends JpaRepository <Category, Long> {
}
