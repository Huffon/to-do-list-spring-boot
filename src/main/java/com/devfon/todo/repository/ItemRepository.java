package com.devfon.todo.repository;

import com.devfon.todo.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    public List<Item> findByTitle(String title);
    public List<Item> deleteByTitle(String title);
}
