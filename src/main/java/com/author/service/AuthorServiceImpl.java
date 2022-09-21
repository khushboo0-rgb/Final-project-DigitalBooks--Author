package com.author.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.Book;

import com.author.exception.*;

@Service
public class AuthorServiceImpl implements IAuthorService {
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public Integer saveBook(Book author) {
		
		Book savedBook =authorRepository.save(author);
		
		return savedBook.getBookId();
	}
	@Override
	public void deleteBook(Integer bookId) {
		authorRepository.deleteById(bookId);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Book> getBookById(Integer bookId) {
		return authorRepository.findById(bookId);
	}

	@Override
	public Book updateBook(Book book , Integer bookId)
	{
		Book existingBook = authorRepository.findById(bookId).orElseThrow(()
				-> new ResourceNotFoundException("Book", "Id", bookId));
				existingBook.setTitle(book.getTitle());
				existingBook.setCategory(book.getCategory());
				
				existingBook.setImage(book.getImage());
				existingBook.setPrice(book.getPrice());
				
				existingBook.setPublisher(book.getPublisher());
				existingBook.setAuthorName(book.getAuthorName());	
				existingBook.setReleasedDate(book.getReleasedDate());
				existingBook.setContent(book.getContent());
				existingBook.setActive(book.isActive() );
				existingBook.setReadable(book.isReadable() );
		authorRepository.save(existingBook);
		return existingBook;
	}

//	@Override
//	public List<Book> searchBook(String title, String authorName, String publisher) {
//////		System.out.println("khushboo in searchBook function");
//////		return authorRepository.searchBook(title, authorName, publisher);
////		List <Book> book = authorRepository.findAll().stream().filter(e -> 
////		(e.getTitle().equalsIgnoreCase(title))&& e.getAuthorName().equalsIgnoreCase(authorName)&& e.getPublisher().equalsIgnoreCase(publisher)).collect(Collectors.toList());
////	return book;
//	
//	}
	@Override
	public List<Book> searchBook(String title, String authorName,String publisher) {
	
		List<Book>obj= authorRepository.searchBook(title, authorName, publisher);
		
		return obj.stream().filter(book->book.isActive() == true).collect(Collectors.toList());
//		return authorRepository.searchBook(title, authorName, publisher);
		
	}
	@Override
	public List<Book> getBook(String authorName) {
		return authorRepository.findByAuthorName(authorName);
	}
	@Override
	public List<Book> getPurchasedBookById(boolean readable) {
		return authorRepository.findByReadable(readable);
	
	} 
	

}
