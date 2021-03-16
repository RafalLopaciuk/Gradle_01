package com.example;

public class Samochod {
    private Kola kola;
    private Silnik silnik;
    private Karoseria karoseria;

    public Samochod(){
        kola = new Kola(17);
        silnik = new Silnik(1.3);
        karoseria = new Karoseria("coupe");
    }

    public Samochod(Kola kola, Silnik silnik, Karoseria karoseria){
        this.kola = kola;
        this.silnik = silnik;
        this.karoseria = karoseria;
    }
}
