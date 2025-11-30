package com.example.demo.hello;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping(path="/items")
	public List<Item> getAllItems()  throws Exception{
		return itemService.getAllItems();
	} 
	
	@PostMapping(path="/addItem")
	public void addItem(@RequestBody Item it) throws Exception {
		itemService.addItem(it);
	}
	
	@GetMapping(path="/items/{code}")
	public Item findItemById(@PathVariable String code) throws Exception {
	    return itemService.findItemById(code)
	                      .orElseThrow(() -> new RuntimeException("Item not found"));
	}
}