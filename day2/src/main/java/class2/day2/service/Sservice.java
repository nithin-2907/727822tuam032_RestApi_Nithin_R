package class2.day2.service;


import class2.day2.repository.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import class2.day2.model.Model;

@Service
public class Sservice {
    @Autowired
    private Repository repo;
    public List<Model> ListAll()
    {
        return repo.findAll();
    }
    
}
