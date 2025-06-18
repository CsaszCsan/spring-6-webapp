package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.stereotype.Service;
import guru.springframework.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    
    public AuthorServiceImpl(AuthorRepository Repository) {
        this.authorRepository = Repository;
    }

    @Override
    public Iterable<Author> FindAll() {
        return authorRepository.findAll();
    }


}
