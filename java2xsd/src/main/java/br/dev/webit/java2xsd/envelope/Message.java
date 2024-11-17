package br.dev.webit.java2xsd.envelope;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class Message {

    @XmlAttribute
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
