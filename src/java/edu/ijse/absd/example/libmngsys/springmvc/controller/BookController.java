/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.example.libmngsys.springmvc.controller;

import edu.ijse.absd.example.libmngsys.springmvc.model.Book;
import edu.ijse.absd.example.libmngsys.springmvc.model.BookModel;
import edu.ijse.absd.example.libmngsys.springmvc.service.BookService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author linux
 */
@Controller
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String newBook(ModelMap modelMap) {
        Book book = new Book();
        modelMap.addAttribute("book", book);
        return "addBook";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String saveBook(@Valid Book book, BindingResult result, ModelMap modelMap) {
        if (result.hasErrors()) {
            return "addBook";
        }

        modelMap.addAttribute("id", book.getId());
        modelMap.addAttribute("title", book.getTitle());
        modelMap.addAttribute("author", book.getAuthor());
        service.saveBook(book);
        return "viewAddBook";
    }

    @RequestMapping(value = "/addBook2", method = RequestMethod.GET)
    public ModelAndView addBook2(){
        ModelAndView modelAndView = new ModelAndView("addBook2");
        return modelAndView;
    }
    
    @RequestMapping(value = "/addBook2", method = RequestMethod.POST)
    public void printBook2(@Valid BookModel bookModel){
        System.out.println("addBook2===========");
        System.out.println("title : "+bookModel.getTitle());
        System.out.println("title : "+bookModel.getAuthor());
    }
}
