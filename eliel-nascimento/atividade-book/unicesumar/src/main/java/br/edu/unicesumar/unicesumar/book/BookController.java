package br.edu.unicesumar.unicesumar.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public ResponseEntity<List<BookModel>> getBookData(){
        try {
            return new ResponseEntity<>(bookService.getBookData(),HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PostMapping()
    public ResponseEntity saveBookData(@RequestBody BookModel bookModel){
        try {
            bookService.saveBookData(bookModel);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping()
    public ResponseEntity updateBookData(@RequestParam(value = "bookId") Long bookId){
        try {
            bookService.deleteBookData(bookId);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PutMapping()
    public ResponseEntity updateBookData(@RequestBody BookModel bookModel){
        try {
            bookService.updateBookData(bookModel);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

}
