package com.calling_api.Calling_API.Controller;

import com.calling_api.Calling_API.Service.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @Autowired
    private ServiceLayer serviceLayer;

    // @GetMapping("/")
    // public ResponseEntity<DataSet> getData(){
    //     return new ResponseEntity<>(serviceLayer.getAllData(), HttpStatus.OK);
    // }


    @GetMapping("/")
    public String about( Model model ){
        //System.out.println(serviceLayer.getAllData());
        model.addAttribute("data", serviceLayer.getAllData().getLatestPhotos());
        return "index";
    }
}