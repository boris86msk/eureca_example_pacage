package com.example.eurica_phone_book_client.servise;

import com.example.eurica_phone_book_client.model.entity.PhoneModel;
import com.example.eurica_phone_book_client.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationNewPhone {

    @Autowired
    private PhoneRepository phoneRepository;

    public String saveToBase(PhoneModel phoneModel) {
        try {
            phoneRepository.save(phoneModel);
            return "номер зарегестрирован";
        } catch (Exception e) {
            return "произошла ошибка, повторите попытку позже";
        }
    }
}
