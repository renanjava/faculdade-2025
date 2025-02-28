package br.edu.unicesumar.unicesumar.book;

import br.edu.unicesumar.unicesumar.book.BookModel;

import java.util.List;


public interface BookServiceInterface {
    BookModel saveBookData(BookModel bookModel);
    List<BookModel> getBookData();
    BookModel updateBookData(BookModel bookModel);
    void deleteBookData(Long id);
}
