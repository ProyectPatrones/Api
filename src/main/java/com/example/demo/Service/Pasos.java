package com.example.demo.Service;

import com.example.demo.Model.Report;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class Pasos {
    List<Report> Reports = new ArrayList<Report>(Arrays.asList(
            new Report("Pasos",20),
            new Report("Caloritas", 30)
    ));
    public List<Report> getReports(){
        return  Reports;
    }
}
