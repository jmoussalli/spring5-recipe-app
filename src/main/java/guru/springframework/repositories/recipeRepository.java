package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 12/01/2021 at 17:15
 */
public interface recipeRepository extends CrudRepository<Recipe, Long> {
}
