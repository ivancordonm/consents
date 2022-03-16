package com.axa.es.consents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Consents implements Serializable {

    @Getter(onMethod = @__(@JsonValue))
    @Setter(onMethod = @__(@JsonValue))
    private List<Consent> consents;

}
