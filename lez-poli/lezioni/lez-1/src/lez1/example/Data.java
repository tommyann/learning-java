package lez1.example;

public class Data {
    private int giorno;
    private int mese;
    private int anno;

    //public

    //costruttori
    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    public Data(int mese, int anno){
        this(1, mese, anno);
    }
    public void copiaDa(Data d){
        this.giorno = d.giorno;
        this.mese = d.mese;
        this.anno = d.anno;
    }

    public int getGiorno() {
        return giorno;
    }
    public int getMese() {
        return mese;
    }
    public int getAnno() {
        return anno;
    }
    public void capodanno(){
        giorno=1;
        mese=1;
        anno=anno+1;
    }
}
