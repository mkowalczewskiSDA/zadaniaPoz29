package pl.COI.zad12.controller;

import pl.COI.zad12.dao.BookDao;
import pl.COI.zad12.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestMapping("/book")
@SessionScope
public class BookController {

    @Autowired
    BookDao bookDao;

    @RequestMapping("/list")
    public String listBook(Model model) {
        model.addAttribute("books", bookDao.getBooks());
        return "book_list";
    }

    @PostMapping("/delete")
    public String deleteBook(@RequestParam int id, Model model) {
        bookDao.deleteBook(id);
        model.addAttribute("books", bookDao.getBooks());
        return "book_list";
    }

    @PostMapping("/edit")
    public String editBook(@RequestParam int id, Model model) {
        model.addAttribute("book", bookDao.getBookById(id));
        return "post_book";
    }

    @PostMapping("/save")
    public String saveBook(Book book) {
        bookDao.editBook(book);
        return "redirect:list";
    }

    @GetMapping("/addNew")
    public String addNewUser(Model model) {
        model.addAttribute("book", new Book());
        return "post_book";
    }


}
