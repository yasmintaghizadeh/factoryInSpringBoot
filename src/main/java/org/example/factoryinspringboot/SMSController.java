package org.example.factoryinspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class SMSController {
    private final SMSService smsService;
    @GetMapping("/send-sms")
    public String sendSMS(@RequestBody String type) {
       return smsService.welcomeUser(type);
    }
}
