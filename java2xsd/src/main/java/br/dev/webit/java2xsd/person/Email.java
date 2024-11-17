package br.dev.webit.java2xsd.person;

import java.util.Objects;

import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

@XmlType
public final class Email implements ContactInformation {

    @XmlValue
    private String email;

    private Email() {
    }

    public Email(String email) {
        this();
        this.email = Objects.requireNonNull(email);
    }

    public String getEmail() {
        return email;
    }
}
