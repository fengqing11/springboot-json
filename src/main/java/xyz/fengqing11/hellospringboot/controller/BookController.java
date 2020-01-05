package xyz.fengqing11.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fengqing11.hellospringboot.pojo.Book;

import java.util.Date;  

@RestController
public class BookController {

    @GetMapping("/book")
    public Book book(){
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }

}
