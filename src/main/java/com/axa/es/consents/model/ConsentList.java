package com.axa.es.consents.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ConsentList implements Serializable {

    private List<String> consentIds;

}
