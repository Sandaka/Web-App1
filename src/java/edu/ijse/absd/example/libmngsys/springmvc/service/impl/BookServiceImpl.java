/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.example.libmngsys.springmvc.service.impl;

import edu.ijse.absd.example.libmngsys.springmvc.dao.BookDao;
import edu.ijse.absd.example.libmngsys.springmvc.model.Book;
import edu.ijse.absd.example.libmngsys.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author linux
 */
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao dao;
    
    public void saveBook(Book book) {
        dao.saveBook(book);
    }
    
}
