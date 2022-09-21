package com.author.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.author.model.Book;


public interface IAuthorRepository extends JpaRepository<Book, Integer> {

	@Query(value="select * from book where title like %?1% or author_name like %?2% or publisher like %?3%",nativeQuery = true)
	List<Book> searchBook(String title,String authorName,String publisher);
	List<Book> findByAuthorName(String authorName);
	@Query(value="select * from book where readable equals '1'", nativeQuery = true)
	List<Book> findByReadable(boolean readable);
}
