package lez1.example;

public enum StudentType {
    ING("Ingegneria"),
    ARCH("Architettura"),
    DES("Design"),
    WRONG("Universita sbagliata");

    private final String name;
    private StudentType(String name){
        this.name = name;
    }
}
