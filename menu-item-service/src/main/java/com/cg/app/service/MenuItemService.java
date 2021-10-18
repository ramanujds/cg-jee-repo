package com.cg.app.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.model.MenuItem;
import com.cg.app.repo.MenuItemRepo;

@Service
public class MenuItemService {
	
	@Autowired
	MenuItemRepo repo;
	
	@PostConstruct	
	public void loadDbValues() {
		MenuItem item1=new MenuItem(1001, "Burger", 99);
		MenuItem item2=new MenuItem(1002, "Pizza", 199);
		MenuItem item3=new MenuItem(1003, "Pasta", 149);
		
		repo.save(item1);
		repo.save(item2);
		repo.save(item3);
	}

	public MenuItem getMenuItemById(int id) {
		return repo.findById(id).get();
	}
	
	
	
	
}
