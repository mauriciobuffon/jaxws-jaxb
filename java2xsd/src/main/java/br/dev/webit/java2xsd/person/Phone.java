package br.dev.webit.java2xsd.person;

import java.util.Objects;

import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

@XmlType
public final class Phone implements ContactInformation {

    @XmlValue
    private String phone;

    private Phone() {
    }

    public Phone(String phone) {
        this();
        this.phone = Objects.requireNonNull(phone);
    }

    public String getPhone() {
        return phone;
    }
}
