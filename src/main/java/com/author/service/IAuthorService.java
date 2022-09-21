package com.author.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.author.model.Book;






public interface IAuthorService {
	Integer saveBook(Book author);
	public List<Book> getAllBooks()	;
	Book updateBook(Book book , Integer id);
	
	Optional<Book> getBookById(Integer bookId);

	List<Book>searchBook(String title,String author,String publisher);
	public void deleteBook(Integer bookId);
	List<Book> getBook(String authorName);
	List<Book> getPurchasedBookById(boolean readable);
}
