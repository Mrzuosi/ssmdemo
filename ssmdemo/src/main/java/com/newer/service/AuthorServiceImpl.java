package com.newer.service;

import com.newer.dao.AuthorMapper;
import com.newer.pojo.Author;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    private AuthorMapper authorMapper;

    public AuthorMapper getAuthorMapper() {
        return authorMapper;
    }

    public void setAuthorMapper(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }

    @Override
    public List<Author> findAll() {
        return authorMapper.findAll();
    }
}
