package dev.struchkov.example.java;

import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        java8();
        java9();
    }

    public static void java8() {
        Person person = Optional.ofNullable(getPerson())
                .orElse(getDefaultPerson());
    }

    public static void java9() {
        Person person = Objects.requireNonNullElse(getPerson(), getDefaultPerson());
    }

    private static Person getPerson() {
        return new Person();
    }

    private static Person getDefaultPerson() {
        return new Person();
    }

}
