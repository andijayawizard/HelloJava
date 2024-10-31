package com.andijaya.javafundamental.basic;

import com.andijaya.javafundamental.basic.kendaraan.Kereta;
import com.andijaya.javafundamental.basic.kendaraan.Mobil;
import com.andijaya.javafundamental.basic.kendaraan.Motor;
import com.andijaya.javafundamental.basic.musik.Gitar;
import com.andijaya.javafundamental.basic.musik.Piano;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("halo dek");
        Gitar.bunyi();
        Piano.caraBermain();
        Mobil.tampilkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Kereta.tampilkanJumlahBan();

        Date today=new Date();
        System.out.println("Hari ini: "+today);
        Date tomorrow= DateUtils.addDays(today,1);
        System.out.println("Besok hari: "+tomorrow);
    }
}
