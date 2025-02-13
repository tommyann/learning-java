package lez1.example;

public class Corso {
    //private Student[] students; questo codice va bene,
    //private final Student[] students; //ma così no perché se è final devo inizializzarlo subito
    private final Student[] students;
    private int numStudents;

    public Corso(int capacity){
        students = new Student[capacity];
        this.numStudents=0;
    }
    public void addStudent(Student s){
        students[numStudents] = s;
        numStudents++;
    }

    public float getAverage(){
        float sum = 0;
        for(int i=0; i<numStudents; i++){
            sum += students[i].getVoto();
        }
        return numStudents == 0 ? 0 : sum/numStudents;
    }

    public float getAverage2(){
        float sum = 0;
        for(Student s : students){  //NB scandisce tutto l'array, anche quando va oltre numStudents
            if(s!=null)
                sum += s.getVoto();
        }
        return numStudents==0 ? 0 : sum/numStudents;
    }
}
