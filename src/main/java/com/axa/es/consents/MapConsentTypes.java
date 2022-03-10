package com.axa.es.consents;

import com.axa.es.consents.model.Consent;
import com.axa.es.consents.model.Consents;
import com.axa.es.consents.model.ConsentList;

import java.util.ArrayList;
import java.util.List;

public class MapConsentTypes {

    public Consents mapTypes(ConsentList consentList) {

        List<Consent> mappedConsents = new ArrayList<>();

        for (String type : consentList.getConsentIds()) {
            mappedConsents.add(new Consent(type, false));
        }
        return new Consents(mappedConsents);
    }

}
