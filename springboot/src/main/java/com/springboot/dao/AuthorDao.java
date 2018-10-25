package com.springboot.dao;

import java.util.List;

import com.springboot.entity.Author;

public interface AuthorDao {
	int add(Author author);

	int update(Author author);

	int delete(Long id);

	Author findAuthor(Long id);

	List<Author> findAuthorList();
}
