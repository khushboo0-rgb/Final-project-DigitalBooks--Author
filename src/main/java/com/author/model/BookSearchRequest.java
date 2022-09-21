package com.author.model;

import java.util.Date;

public class BookSearchRequest {

	private String title;
	private String authorName;
	private String publisher;
//	private Date releasedDate;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

//	public Date getReleasedDate() {
//		return releasedDate;
//	}
//
//	public void setReleasedDate(Date releasedDate) {
//		this.releasedDate = releasedDate;
//	}

	@Override
	public String toString() {
		return "BookSearchRequest [title=" + title + ", authorName=" + authorName + ", publisher=" + publisher + " ]";
	}
	
	
}