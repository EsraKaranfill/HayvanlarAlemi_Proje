package com.esra.enttiy;

public class Hayvan {
    private String isim;
    private int yas;

    public Hayvan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public void yemekYe(){
        System.out.println(isim+" yemek yiyor.");
    }
    public void hareketEt(){
        System.out.println(isim+" hareket ediyor.");
    }
    public void sesCikar(){
        System.out.println(isim+" ses çıkarıyor");
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
