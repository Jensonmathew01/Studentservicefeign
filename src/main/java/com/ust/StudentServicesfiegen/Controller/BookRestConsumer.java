package com.ust.StudentServicesfiegen.Controller;

import com.ust.StudentServicesfiegen.Model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="BOOK-SERVICE")
public interface BookRestConsumer {

    @GetMapping("/book/data")
    public String getBookData();

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Integer id);

    @GetMapping("/book/all")
    public List<Book> getAllBooks();

    @GetMapping("book/entity")
    public ResponseEntity<String> getEntityData();

}
