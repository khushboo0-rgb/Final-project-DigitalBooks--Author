package com.author.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.Book;
import com.author.model.BookSearchRequest;
import com.author.service.IAuthorService;





@RestController
@RequestMapping("/book")
@CrossOrigin(origins= "http://localhost:4200")
public class AuthorController {

	@Autowired
	IAuthorService authorService;
	

 
 @PostMapping("/saveauthor")
 Integer createEmployee(@RequestBody Book author)
 {
	 Integer bookId = authorService.saveBook(author);
	 System.out.println(bookId);
	return bookId;
 }
 @GetMapping("/allbooks")
 public List<Book> getBook()
 {
	 return authorService.getAllBooks();
 }
 @GetMapping("/getBook/{bookId}")
 public Optional<Book> getBookById(@PathVariable Integer bookId)
 {
	 Optional<Book> author = authorService.getBookById(bookId);
	 return author;
 }
 @GetMapping("/getPurchasedBook/{readable}")
 public List<Book> getPurchasedBookById(@PathVariable boolean readable)
 {
	 List<Book> book =  authorService.getPurchasedBookById(readable);
		
	
	 return book;
 }
 
 @PutMapping("/update/{bookId}")
	public ResponseEntity<Book> updateStudent(@PathVariable("bookId") Integer bookId , @RequestBody Book book)
	{
		return new ResponseEntity<Book>(authorService.updateBook(book, bookId), HttpStatus.OK);
	}
 @PostMapping("/searchBook")
	public List<Book>searchBook(@RequestBody BookSearchRequest bookSearch){
//System.out.println("khushu2");
		return authorService.searchBook(bookSearch.getTitle(), bookSearch.getAuthorName(),bookSearch.getPublisher());
		
	}
 @DeleteMapping("/book/{bookId}")
 public ResponseEntity<Book> deleteStudent(@PathVariable Integer bookId)
 {
	 
	 	ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
	 	try
	 	{
	 		authorService.deleteBook(bookId);
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 		responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 	}
	 	return responseEntity;
	 	
 }	
 @GetMapping("/getbookByAuthor/{authorName}")
 public List<Book> getBookByAuthorName(@PathVariable String authorName)
 {
	 List<Book> book = authorService.getBook(authorName);
	
	 return book;
 }
}
