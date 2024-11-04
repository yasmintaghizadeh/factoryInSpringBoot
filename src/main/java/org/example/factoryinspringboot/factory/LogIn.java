package org.example.factoryinspringboot.factory;

import org.springframework.stereotype.Service;

@Service(LogIn.BEAN_ID)
public class LogIn implements SMS{
    public static final String BEAN_ID="LogIn";
    @Override
    public String sendSms() {
        return "welcome to sms application";
    }
}
