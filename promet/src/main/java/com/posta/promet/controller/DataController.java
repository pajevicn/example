package com.posta.promet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posta.promet.model.Data;
import com.posta.promet.service.DataService;

@RestController
public class DataController {
	
	@Autowired
	public DataService dataService;
	
	@GetMapping(value="api/podaci")
	public ResponseEntity<List<Data>> getAll() {
		final List<Data> retVal=dataService.findAll();
		return new ResponseEntity<List<Data>>(retVal,HttpStatus.OK);
	}
}
