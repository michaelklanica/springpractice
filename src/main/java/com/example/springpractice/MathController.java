package com.example.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{numA}/and/{numB}")
    @ResponseBody
    public int addition(@PathVariable int numA, @PathVariable int numB){
        int numC = numA + numB;
        return numC;
    }

    @GetMapping("/subtract/{numA}/from/{numB}")
    @ResponseBody
    public int subtraction(@PathVariable int numA, @PathVariable int numB){
        int numC = numB - numA;
        return numC;
    }

    @GetMapping("/multiply/{numA}/and/{numB}")
    @ResponseBody
    public int multiplication(@PathVariable int numA, @PathVariable int numB){
        int numC = numA * numB;
        return numC;
    }

    @GetMapping("/divide/{numA}/by/{numB}")
    @ResponseBody
    public int division(@PathVariable int numA, @PathVariable int numB){
        int numC = numA / numB;
        return numC;
    }


}
