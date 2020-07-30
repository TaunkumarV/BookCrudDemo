package com.tel.springboot.mongo.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tel.springboot.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
