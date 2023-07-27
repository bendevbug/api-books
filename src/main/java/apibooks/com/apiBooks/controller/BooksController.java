package apibooks.com.apiBooks.controller;


import apibooks.com.apiBooks.Books.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BooksController {

    @Autowired
    private BooksRepository repository;

    @PostMapping
    @Transactional
    public void registerBooks(@RequestBody DataBooks data) {
        repository.save(new Book(data));
    }

    @GetMapping
    public List<DataListBooks> listBooks() {
        return repository.findAll().stream().map(DataListBooks::new).toList();
    }

    @PutMapping
    @Transactional
    public void editBooks(@RequestBody DataCurrentBooks data) {
        var book = repository.getReferenceById(data.id());
        book.updateInfoBook(data);
    }
}
