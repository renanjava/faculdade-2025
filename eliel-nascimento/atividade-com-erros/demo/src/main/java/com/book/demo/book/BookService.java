package com.book.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookModel> findAll(){
        return this.bookRepository.findAll();
    }
    public BookModel criarLivro(BookModel bookModel){
        return this.bookRepository.save(bookModel);
    }
    public void deletarLivro(Long id){
        this.bookRepository.deleteById(id);
    }
}
