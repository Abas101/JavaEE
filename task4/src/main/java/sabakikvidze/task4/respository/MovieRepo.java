package sabakikvidze.task4.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import sabakikvidze.task4.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
