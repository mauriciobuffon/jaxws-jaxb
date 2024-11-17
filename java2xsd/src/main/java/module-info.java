module webit.java2xsd {
    requires jakarta.xml.bind;

    exports br.dev.webit.java2xsd.envelope;
    exports br.dev.webit.java2xsd.person;
    opens br.dev.webit.java2xsd.envelope to jakarta.xml.bind;
    opens br.dev.webit.java2xsd.person to jakarta.xml.bind;
}