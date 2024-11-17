package br.dev.webit.java2xsd.person;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import br.dev.webit.java2xsd.envelope.Message;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

@XmlType
public class Person extends Message {

    @XmlElement(required = true)
    private String name;

    @XmlElementWrapper(name = "contacts-info", required = true)
    @XmlElements({
            @XmlElement(name = "phone", type = Phone.class),
            @XmlElement(name = "email", type = Email.class)
    })
    private List<ContactInformation> contactsInformation;

    private Person() {
    }

    public Person(String name, Collection<ContactInformation> contactsInformation) {
        this();
        this.name = Objects.requireNonNull(name);
        this.contactsInformation = List.copyOf(contactsInformation);
    }

    public String getName() {
        return name;
    }

    public List<ContactInformation> getContactsInformation() {
        return contactsInformation;
    }
}
