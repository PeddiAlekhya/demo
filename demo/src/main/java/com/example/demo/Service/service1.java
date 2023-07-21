package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.model1;
import com.example.demo.Repository.repository1;



@Service
public class service1 {
    @Autowired
   repository1 repo;

   public void add1(model1 use) {
     repo.save(use);

}
    
}
