package com.kata.gbsuftblai.controllers;

import com.kata.gbsuftblai.dto.ResultDto;
import com.kata.gbsuftblai.services.GbsuFtbLaiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/gbsu-ftb-lai")
public class GbsuFtbLaiController {

    @Autowired
    GbsuFtbLaiService gbsuFtbLaiService;

    @GetMapping(path = "/{inputNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
    public ResultDto convertNumber(@PathVariable(name = "inputNumber") Integer inputNumber) {
        return new ResultDto( gbsuFtbLaiService.convertNumber(inputNumber));
    }


}
