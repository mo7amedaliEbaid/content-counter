package com.example.content.counter.repository;

import com.example.content.counter.model.*;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {

        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {

        contentList.add(content);
    }

    public boolean existsById(Integer id) {

        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }
}
