package guru.springframework.spring5webapp.DevBootStrap;


import guru.springframework.spring5webapp.repo.AuthorRepo;
import guru.springframework.spring5webapp.repo.BookRepo;
import guru.springframework.spring5webapp.repo.PublisherRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepo authorRepository;
    private BookRepo bookRepository;
    private PublisherRepo publisherRepo;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    public DevBootstrap(AuthorRepo authorRepository, BookRepo bookRepository, PublisherRepo publisherRepo) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepo = publisherRepo;
    }

    private void initData(){

        Publisher pubG = new Publisher();
        pubG.setName("Shakun");
        publisherRepo.save(pubG);


            Author Neeraj = new Author("Neeraj", "Puri");
            Book  ddd = new Book("Domain Driven Design", "1234", pubG);

            Neeraj.getBooks().add(ddd);
            ddd.getAuthors().add(Neeraj);

            authorRepository.save(Neeraj);
            bookRepository.save(ddd);





        }

}
