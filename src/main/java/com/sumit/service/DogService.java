package com.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sumit.localdata.MockDogProvider;
import com.sumit.model.BaseResponseModel;
import com.sumit.model.Dog;
import com.sumit.model.DogRequestModel;
import com.sumit.model.ErrorModel;

@Service
public class DogService {

	@Autowired 
	private final MockDogProvider mockDogProvider;
	
	public DogService(MockDogProvider mockDogProvider)
	{
		this.mockDogProvider=mockDogProvider;
	}
	
    public void add(DogRequestModel dto) {
        mockDogProvider.add(dto);
    }
    public void delete(long id) {
        mockDogProvider.delete(id);
    }
    public List<Dog> getDogs() {
        return mockDogProvider.getDogs();
    }
    public ResponseEntity<BaseResponseModel> getDogById(long id) {
    	Dog dog = mockDogProvider.findDogById(id);
    	BaseResponseModel baseResponseModel =null;
    	if(dog==null)
    	{
    		ErrorModel error= new ErrorModel();
    		error.setField("ID");
    		error.setMsg("Not found Dog with the Id "+id);
    		baseResponseModel = new BaseResponseModel();
    		baseResponseModel.setError(error);
    		return new ResponseEntity<>(baseResponseModel,null,HttpStatus.NOT_FOUND);
    	}
    	baseResponseModel=new BaseResponseModel();
    	baseResponseModel.setDog(dog);
    	return new ResponseEntity<>(baseResponseModel,HttpStatus.OK);
    }
}
