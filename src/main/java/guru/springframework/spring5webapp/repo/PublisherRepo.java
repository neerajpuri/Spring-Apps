package guru.springframework.spring5webapp.repo;

import guru.framework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher,Long> {


}
