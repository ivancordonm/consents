package com.example.consents;

import com.example.consents.model.Consents;

import org.springframework.stereotype.Service;

import com.example.consents.model.Consent;

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
