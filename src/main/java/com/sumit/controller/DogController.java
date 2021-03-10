package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.model.Dog;
import com.sumit.model.DogDto;
import com.sumit.service.DogService;

@RestController
@RequestMapping("/dogs")
public class DogController {

	@Autowired 
	private final DogService service;
	
	public DogController(DogService service)
	{
		this.service=service;
	}
	@GetMapping
    public List<Dog> getDogs() {
        return service.getDogs();
    }
    @PostMapping
    public void postDogs(@RequestBody DogDto dto) {
        service.add(dto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Dog> getById(@PathVariable(required = true) long id) {
        return service.getDogById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}
