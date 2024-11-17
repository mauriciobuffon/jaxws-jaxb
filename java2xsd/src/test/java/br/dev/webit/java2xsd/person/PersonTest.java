package br.dev.webit.java2xsd.person;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.dev.webit.java2xsd.envelope.Envelope;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

class PersonTest {

    private JAXBContext context;
    private Marshaller marshaller;

    @BeforeEach
    void setup() {
        Assertions.assertDoesNotThrow(
                () -> context = JAXBContext.newInstance(Envelope.class, Person.class, Phone.class, Email.class));
        Assertions.assertDoesNotThrow(() -> marshaller = context.createMarshaller());
        Assertions.assertDoesNotThrow(() -> marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true));
    }

    @Test
    void marshalling() {
        // arrange
        Envelope envelope = new Envelope();
        Person person = new Person("John Doe", List.<ContactInformation>of(new Phone("+123"), new Email("email@mail")));
        person.setId(1);
        envelope.setMessage(person);

        // act & assert
        Assertions.assertDoesNotThrow(() -> marshaller.marshal(envelope, System.out));
    }
}