package guru.springframework.repositories;

import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jerom on 13/01/2021 at 16:18
 */
@Repository
public interface IngredientRepository  extends CrudRepository<Ingredient, Long> {
}
