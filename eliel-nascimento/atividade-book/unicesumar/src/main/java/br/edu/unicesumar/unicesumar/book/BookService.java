package br.edu.unicesumar.unicesumar.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements BookServiceInterface {

    @Autowired
    BookRepository bookRepository;

    @Override
    public BookModel saveBookData(BookModel userEntity) {
        return bookRepository.save(userEntity);
    }

    @Override
    public List<BookModel> getBookData() {
        return bookRepository.findAll();
    }

    @Override
    public BookModel updateBookData(BookModel userEntity) {
        return bookRepository.save(userEntity);
    }

    @Override
    public void deleteBookData(Long id) {
        bookRepository.deleteById(id);
    }

    public String findByStatus(Long id) {
        Optional<BookModel> book = bookRepository.findById(id);
        return book.get().getStatus();
    }
}