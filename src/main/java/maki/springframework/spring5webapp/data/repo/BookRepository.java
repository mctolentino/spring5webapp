package maki.springframework.spring5webapp.data.repo;

import maki.springframework.spring5webapp.data.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
