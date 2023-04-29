package com.example.demo_test.controller;

import com.example.demo_test.model.PhoneModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo_test.controller.ConstantSheet.SAVE_NUM;

@RestController
public class RegistreinfoController {


    @PostMapping(SAVE_NUM)
    public String saveNum(@RequestBody PhoneModel phoneModel) {
        return phoneModel.toString();
    }

    @GetMapping("/get")
    public String getRes() {
        return "hello!";
    }

}
