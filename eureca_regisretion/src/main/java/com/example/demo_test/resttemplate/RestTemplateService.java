package com.example.demo_test.resttemplate;

import com.example.demo_test.model.PhoneModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    RestTemplate restTemplate = new RestTemplate();

    public String saveNewNumber(PhoneModel phoneModel) {
        String body = restTemplate.exchange("http://localhost:8082/save_phone",
                HttpMethod.POST,
                new HttpEntity<>(phoneModel, null),
                String.class).getBody();

        return body;
    }
}
