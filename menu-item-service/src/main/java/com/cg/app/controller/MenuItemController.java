package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.MenuItem;
import com.cg.app.service.MenuItemService;

@RestController
@RequestMapping("/items")
public class MenuItemController {

	@Autowired
	MenuItemService service;
	
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable int id) {
		return service.getMenuItemById(id);
	}
	
}
