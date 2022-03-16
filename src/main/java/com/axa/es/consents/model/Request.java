package com.axa.es.consents.model;

import java.util.List;

import lombok.Data;

@Data
public class Request {

    private String idenpn;

    boolean isclient;

    List<String> consentTypes;

}
