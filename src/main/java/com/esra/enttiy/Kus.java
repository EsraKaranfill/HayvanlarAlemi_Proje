package com.esra.enttiy;

public class Kus extends Hayvan{
    public Kus(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim()+" uçuyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim()+" cik cikliyor");
    }

}
