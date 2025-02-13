package lez1.example;

public class Student extends Person{
    //attributi
    private final int voto;

    //COSTRUTTORI
    //nome e cognome sono privati, quindi non posso accedervi da qui
    //non ereditando il costruttore, questa classe ha il costruttore di default che non inizializza name a surname,
    //quindi Java si arrabbia. Metodi e attributi vengono ereditati, i costruttori no
    public Student(String name, String surname, int age, int voto) {
        super(name, surname, age);
        this.voto=voto;
    }

    //GETTERS
    public int getVoto(){ return voto;}

    @Override
    public void print(){
        System.out.println("Studente: " + getName() + " " + getSurname() + " " + getAge() + " " + voto);
        //un'altra possibile era super() e poi stampare il voto;
        // System.out.print("Studente: "); //stampa studente senza andare a capo (NO ln);
        super.print(); //questo usa il super per stampare il nome e il cognome (e l'età);
    }
}