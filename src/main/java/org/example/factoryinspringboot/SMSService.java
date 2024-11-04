package org.example.factoryinspringboot;

import lombok.RequiredArgsConstructor;
import org.example.factoryinspringboot.factory.Code;
import org.example.factoryinspringboot.factory.Link;
import org.example.factoryinspringboot.factory.LogIn;
import org.example.factoryinspringboot.factory.SMSFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SMSService {
    private final SMSFactory smsFactory;

    public String getSmsType(String type) {
        return switch (type) {
            case "code" -> Code.BEAN_ID;
            case "link" -> Link.BEAN_ID;
            case "login" -> LogIn.BEAN_ID;
            default -> null;
        };
    }

    public String welcomeUser(String type) {
        String typeClass = getSmsType(type);
        return smsFactory.getSMS(typeClass).sendSms();
    }
}
