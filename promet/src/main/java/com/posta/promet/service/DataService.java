package com.posta.promet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.posta.promet.model.Data;
import com.posta.promet.repository.DataRepository;

@Component
public class DataService {
	@Autowired
	private DataRepository dataRepo;
	
	public List<Data> findAll() {
		return dataRepo.findAll();
	}
}
