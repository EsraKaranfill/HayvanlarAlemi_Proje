package com.esra;

import com.esra.enttiy.Balik;
import com.esra.enttiy.Kedi;
import com.esra.enttiy.Kus;
import com.esra.enttiy.Yilan;

public class Runner {
    public static void main(String[] args) {
        Kedi kedi= new Kedi("Limon",2);
        Balik balik=new Balik("Nemo",1);
        Kus kus=new Kus("Tweety",3);
        Yilan yilan=new Yilan("Tiss",6);
        Kus kartal=new Kus("Kral",5);
        Yilan boa=new Yilan("Boa",7);
        Kus guvercin= new Kus("Kanat",2);

        System.out.println(kedi);
        System.out.println(balik);
        System.out.println(kus);
        System.out.println(yilan);

        kedi.setIsim("Fındık");
        kedi.setYas(3);

        System.out.println("Güncellenmiş kedi bilgileri: "+kedi);

        System.out.println(kartal);
        System.out.println(boa);
        System.out.println(guvercin);
    }
}