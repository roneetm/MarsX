package com.calling_api.Calling_API.Service;

import com.calling_api.Calling_API.VO.DataSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
    public static final String API_URL = 
    "https://api.nasa.gov/mars-photos/api/v1/rovers/perseverance/latest_photos?api_key=0pssEHp13Bk1wlqvUtcpbb5x4IAbES4f0FVzCOcy";

    @Autowired
    private RestTemplate restTemplate ;

    public DataSet getAllData(){
        ResponseEntity<DataSet> response=restTemplate.getForEntity(API_URL, DataSet.class);
       return response.getBody();
    }
}