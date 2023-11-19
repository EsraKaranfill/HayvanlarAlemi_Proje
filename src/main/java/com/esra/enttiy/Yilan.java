package com.esra.enttiy;

public class Yilan extends Hayvan{
    public Yilan(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim()+" sürünüyor");
    }

    @Override
    public void yemekYe() {
        System.out.println(getIsim()+" fare yedi");
    }
}
