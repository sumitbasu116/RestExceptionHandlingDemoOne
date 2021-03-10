package com.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sumit.localdata.MockDogProvider;
import com.sumit.model.Dog;
import com.sumit.model.DogDto;

@Service
public class DogService {

	@Autowired 
	private final MockDogProvider mockDogProvider;
	
	public DogService(MockDogProvider mockDogProvider)
	{
		this.mockDogProvider=mockDogProvider;
	}
	
    public void add(DogDto dto) {
        mockDogProvider.add(dto);
    }
    public void delete(long id) {
        mockDogProvider.delete(id);
    }
    public List<Dog> getDogs() {
        return mockDogProvider.getDogs();
    }
    public ResponseEntity<Dog> getDogById(long id) {
    	Dog findDogById = mockDogProvider.findDogById(id);
    	if(findDogById==null)
    	{
    		return new ResponseEntity<>(null,null,HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<>(findDogById,HttpStatus.OK);
    }
}
