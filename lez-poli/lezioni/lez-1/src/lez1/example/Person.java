package lez1.example;

public class Person {
    private final String name; //NB non posso cambiare il riferimento del puntatore, ma posso cambiare
                                //il valore a cui punta (in questo caso no perché la stringa di per sé è immodificabile
                                //ma se puntasse ad un intero potrei cambiare l'intero, mentre se fosse un intero non potrei cambiare l'intero
    private final String surname;
    private int age;
    private static int numPersons = 0;

    //costruttori
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        numPersons++;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
//      //e poi l'age la puoi fare con un setter, perché int age non è final. Alternativamente puoi fare
//      this(name, surname, 0); //in questo caso age viene settato subito, ma poi si può modificare
    }

    //getters
    public String getName(){ return name;}
    public String getSurname(){ return surname;}
    public int getAge(){ return age;}
    public static int getNumPersons(){ return numPersons;}
    //dentro metodi statici non posso chiamare metodi o attributi di istanza, posso fare il contrario

    //setters
    public void setAge(int age) {
        this.age = age;
    }

    //methods
    public void print(){
        System.out.println("\n" + name + " " + surname + ", age: " + age);
        //alternativa
        // System.out.print("Studente: ");
        // super.print();
        // System.out.print(age);
    }
    @Override
    public String toString(){
        return name + " " + surname + ", age: " + age;
    }
}