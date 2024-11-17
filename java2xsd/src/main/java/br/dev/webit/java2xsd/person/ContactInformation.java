package br.dev.webit.java2xsd.person;

public sealed interface ContactInformation permits Phone, Email {
}
