package com.newer.service;

import com.newer.pojo.Author;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();
}
