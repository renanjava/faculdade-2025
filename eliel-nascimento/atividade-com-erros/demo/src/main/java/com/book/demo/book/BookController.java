package com.book.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping
    private ResponseEntity<List<BookModel>> findAll(){
        List<BookModel> bookModel = bookService.findAll();
        return ResponseEntity.ok().body(bookModel);
    }
    @PostMapping
    private ResponseEntity<BookModel> criarLivro(@RequestBody BookDTO bookModel){
        BookModel response = bookService.criarLivro(bookModel.transformaParaObjeto());
        return ResponseEntity.ok().body(response);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        bookService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }



}
