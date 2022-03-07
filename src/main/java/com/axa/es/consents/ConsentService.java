package com.axa.es.consents;

import com.axa.es.consents.model.Consent;

import org.springframework.stereotype.Service;

@Service
public class ConsentService {

    public Consent imprimeConsent(Consent consent) {
        System.out.println("Consent: " + consent.getId());
        System.out.println("Consent: " + consent.isClient());
        return consent;
    }

}
