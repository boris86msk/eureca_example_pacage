package com.example.demo_test.controller;

import com.example.demo_test.model.PhoneModel;
import com.example.demo_test.resttemplate.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo_test.controller.ConstantSheet.SAVE_NUM;

@RestController
public class RegistreinfoController {

    @Autowired
    public RestTemplateService restTemplateService;

    @GetMapping("/get")
    public String getRes() {
        return "hello!";
    }

    @GetMapping("/get2")
    public String getResTwo() {
        return "hello hello";
    }

    @PostMapping(SAVE_NUM)
    public String saveNum(@RequestBody PhoneModel phoneModel) {
        String saveNewNumber = restTemplateService.saveNewNumber(phoneModel);
        return saveNewNumber;
    }

}
