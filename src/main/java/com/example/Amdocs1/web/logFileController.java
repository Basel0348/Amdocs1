package com.example.Amdocs1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Amdocs1.domain.logFile;
import com.example.Amdocs1.domain.logFileRepository;

@RestController
public class logFileController {
	@Autowired
    private logFileRepository repository;

	@RequestMapping("/logFiles")
    public Iterable<logFile> getlogFiles() {
      return repository.findAll();
    }


}
