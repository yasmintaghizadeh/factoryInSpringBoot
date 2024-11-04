package org.example.factoryinspringboot.factory;

import org.springframework.stereotype.Service;

@Service(Code.BEAN_ID)
public class Code implements SMS {
    public static final String BEAN_ID = "Code";

    @Override
    public String sendSms() {
        return "your verification code is: ";
    }
}
