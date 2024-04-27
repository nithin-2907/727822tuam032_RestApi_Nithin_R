package review.cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import review.cc.model.Model;
import review.cc.service.Sservice;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Sservice service;
@PostMapping("/api/model")
public ResponseEntity<?> createfirstname(@RequestBody Model model)
{
    try
        {
            return new ResponseEntity<>(service.createfirstname(model),HttpStatus.CREATED);
        }catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

@GetMapping("/api/models")
    public ResponseEntity<?> getAllfirstname()
    {
        try
        {
            return new ResponseEntity<>(service.getAllfirstname(),HttpStatus.OK);
        }catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

@GetMapping("/api/model/{email}")
    public ResponseEntity<?> getModelbyEmail(@PathVariable String email)
    {
        try
        {
            return new ResponseEntity<>(service.getModelbyEmail(email),HttpStatus.OK);
        }catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
