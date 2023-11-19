package com.esra.enttiy;

public class Kedi extends Hayvan{

    public Kedi(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim()+" miyavlıyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim()+" yürüyor");
    }
}
