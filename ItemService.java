package com.example.demo.hello;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	//find all
	public List<Item> getAllItems() throws Exception {
		return itemRepository.findAll();
	}	
	
	//add item 
	public void addItem(Item it) throws Exception {	
		Optional<Item> byId = itemRepository.findById(it.getCode());
		if(!byId.isPresent())
			itemRepository.save(it);
	}
	
	//find by id
	public Optional<Item> findItemById(String code) throws Exception {
	    return itemRepository.findById(code);
	}

}