package com.example.consents;

import com.example.consents.model.Consent;
import com.example.consents.model.Consents;
import com.example.consents.model.Request;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapConsentTypes {

    public Consents mapTypes(Request request) {

        List<Consent> mappedConsents = new ArrayList<>();

        List<String> types = request.getConsentTypes();

        for (String type : types) {
            System.out.println("type: " + type);
            mappedConsents.add(new Consent(type, false));
        }
        return new Consents(mappedConsents);
    }

}
