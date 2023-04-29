package com.example.eurica_phone_book_client.controller;

import com.example.eurica_phone_book_client.model.entity.PhoneModel;
import com.example.eurica_phone_book_client.servise.RegistrationNewPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneBookController {
    @Autowired
    private RegistrationNewPhone registrationNewPhone;

    @PostMapping("/save_phone")
    public String savePhoneNumber(@RequestBody PhoneModel phoneModel) {
        return registrationNewPhone.saveToBase(phoneModel);
    }
}
