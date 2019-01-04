package guru.springframework.spring5webapp.repo;

import guru.framework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
