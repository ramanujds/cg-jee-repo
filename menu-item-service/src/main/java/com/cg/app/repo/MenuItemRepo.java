package com.cg.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.model.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Integer> {

	
	
}
