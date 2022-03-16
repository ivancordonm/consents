package com.axa.es.consents;

import com.axa.es.consents.model.Consents;

import org.springframework.stereotype.Service;

import com.axa.es.consents.model.Consent;

@Service
public class VerifyConsents {

    public boolean verifyConsents(Consents consents) {

        for (Consent consent : consents.getConsents()) {
            if (!consent.isAccepted()) {
                return false;
            }
        }
        return true;
    }

}