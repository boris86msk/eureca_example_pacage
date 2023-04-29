package com.example.eurica_phone_book_client.repository;

import com.example.eurica_phone_book_client.model.entity.PhoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public interface PhoneRepository extends JpaRepository<PhoneModel, Long> {
}
