package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 12/01/2021 at 17:16
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
