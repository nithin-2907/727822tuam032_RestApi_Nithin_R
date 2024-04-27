package class2.day2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import class2.day2.model.Model;
import class2.day2.service.Sservice;


@RestController
public class Controller
{
    private Sservice ab;
    @GetMapping("/basiccrud")
    public List<Model> abc()
    {
        return ab.ListAll();
    }
}
