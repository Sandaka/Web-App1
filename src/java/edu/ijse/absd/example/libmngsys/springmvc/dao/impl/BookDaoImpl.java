/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.example.libmngsys.springmvc.dao.impl;

import edu.ijse.absd.example.libmngsys.springmvc.dao.AbstractDao;
import edu.ijse.absd.example.libmngsys.springmvc.dao.BookDao;
import edu.ijse.absd.example.libmngsys.springmvc.model.Book;
import org.springframework.stereotype.Repository;

/**
 *
 * @author linux
 */
@Repository("bookDao")
public class BookDaoImpl extends AbstractDao<Integer, Book> implements BookDao{

    
    
    public void saveBook(Book book) {
        persist(book);
    }
    
}
