package org.example.factoryinspringboot.factory;

import org.springframework.stereotype.Service;

@Service(Link.BEAN_ID)
public class Link implements SMS{
    public static final String BEAN_ID="Link";

    @Override
    public String sendSms() {
        return "verify by link bellow";
    }
}
