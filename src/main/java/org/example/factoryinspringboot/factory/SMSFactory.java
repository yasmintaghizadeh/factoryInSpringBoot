package org.example.factoryinspringboot.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SMSFactory {
    private final Map<String, SMS> smsMap = new HashMap<>();

    public SMS getSMS(String smsType) {
        return smsMap.get(smsType);
    }
}
