package com.example.demo.Controller;

import com.example.demo.Model.Report;
import com.example.demo.Service.Pasos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {
    @Autowired
    private Pasos PasosSer;
    @RequestMapping("/Reports")
    public List<Report> getALlReports(){
        return PasosSer.getReports();
    }
    @RequestMapping("/ya")
    public String getYa(){
        return "YA";
    }
}
