package com.esra.enttiy;

public class Balik extends Hayvan{

    public Balik(String isim, int yas) {
        super(isim, yas);
    }
    public void hareketEt() {
        System.out.println(getIsim()+" yüzüyor.");
    }


}
