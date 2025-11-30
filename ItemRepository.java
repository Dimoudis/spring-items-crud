package com.example.demo.hello;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface for the Item to connect with the JPA Student
// Only basic implementations are inherited

// item -> object item, Code -> String primary key
public interface ItemRepository extends JpaRepository<Item, String> {
}