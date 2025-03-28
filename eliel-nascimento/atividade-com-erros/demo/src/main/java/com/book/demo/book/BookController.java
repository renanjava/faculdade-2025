package com.book.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookModel>> findAll(){
        List<BookModel> bookModel = this.bookService.findAll();
        return ResponseEntity.ok().body(bookModel);
    }
    @PostMapping
    public ResponseEntity<BookModel> criarLivro(@RequestBody BookModel bookModel){
        BookModel response = this.bookService.criarLivro(bookModel);
        return ResponseEntity.ok().body(response);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        this.bookService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }



}
