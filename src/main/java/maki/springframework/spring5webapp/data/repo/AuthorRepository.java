package maki.springframework.spring5webapp.data.repo;

import maki.springframework.spring5webapp.data.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
