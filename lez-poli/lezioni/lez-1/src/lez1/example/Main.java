package lez1.example;

public class Main{
    public static void main(String[] args) {
        int x=10;
        double y=3.14; //le variabili primitive (lettera minuscola) sono sempre nello stack
        Data d = null; //gli oggettI (lettera maiuscola, String compresa) sono nello heap, quindi sono puntatori
        //d = new Data(); //costruttore (come malloc in C), inizializza un'area
                        // di memoria nello heap e la popola con valori per giorno, mese e anno
                        // inizializzati a 0, 0, 0. Il costruttore di default, usato se non viene creato un metodo
                        // nella classe, inizializza i numeri a zero, i booleani a false, i riferimenti a null e i
                         // caratteri a \u0000, un piccolo quadratino (  non stampabile)
// creare un costruttore nella classe, però, elimina il costruttore di defaulta, quindi la riga 8 non funziona
        d=new Data(25, 9, 2023);
        Data d1= new Data(12, 12, 2020);
        d1.capodanno();
        d.copiaDa(d1);
        Data d2=new Data(12, 12, 2023);
        d2 = d; //QUESTA OPERAZIONE in C creerebbe una regione di memoria irraggingibile perché si perde il puntatore,
                //ma java ha dei garbage collector, che marca i puntatori che raggiungono qualcosa e le aree della memoria,
                //se qualche puntatore non punta a niente viene eliminato, se qualche zona marcata non è puntata da niente
                //viene liberata
        swap(d, d1);
        System.out.println(d.getAnno()); //NB qui non puoi fare d.anno, perché anno è un attributo privato



        Person p1 = new Person("A", "A", 15);
        Student p2 = new Student("B", "B", 15, 30);
        //Student p3 = new Person("C", "C", 16); //ERRORE, non tutte le persone sono studenti
        Person p4 = new Student("D", "D", 12, 30); //OK: tutti gli studenti sono studenti
        p1.print();
        p2.print();
        p4.print(); // perché stampa studente anche se il tipo statico è Person? il codice chiamato è il codice più specifico, quello dinamico
        //però non si può usare il getVoto per la persona p4
        System.out.println(p1.toString());
        System.out.println(p4);

        Person array[] = new Person[3]; //la memoria nello heap contiene 3 riferimenti a tipo persona che vengono inizializzati al default null
        //per assegnare i valori posso farlo indice a indice
        array[0] = new Person("C", "C", 25);
        array[1] = p1;
        int array2[] = new int[3]; //qui invece l'array nello heap contiene gli interi, inizializzati a zero

        StudentType t = StudentType.ING;
        int numPerson = Person.getNumPersons();
        //notare che andrebbe bene anche
        numPerson = Student.getNumPersons();

        //PUNTI 2D
        Punto2d A = new Punto2d(1, 1);
        System.out.println(A.getX());

        //PUNTI 2D e 3D
        Punto2d a = new Punto2d(1, 2);
        Punto2d b = new Punto3d(2, 4, 6);
        Punto3d c = new Punto3d(3, 4, 6);

        a.dist(a);
        a.dist(b);
        a.dist(c);

        b.dist(a);
        b.dist(b);
        b.dist(c);

        c.dist(a);
        c.dist(b);
        c.dist(c);


        //Figura f1 = new Figura(); non posso istanziare una figura perché è una classe astratta
        Figura f1 = new Quadrato();
        Quadrato f2 = new Quadrato();
    }



    public static void swap(Data a, Data b){ //NB questa funzione non fa niente perché i puntatori sono passati per copia
        Data tmp = a;
        a = b;
        b = tmp;
    }

}
// https://aunicalogin.polimi.it/aunicalogin/getservizio.xml?id_servizio=2294&c_classe_webeep=810350-STD
// arrivato a 2023 09 28