package guru.springframework.spring5webapp.repo;

import guru.framework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Long> {


}
