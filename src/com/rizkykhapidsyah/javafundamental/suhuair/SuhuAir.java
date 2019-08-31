package com.rizkykhapidsyah.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        //Contoh Pemakaian IF Tiga Kasus: Wujud Air

        //Kamus
        int T;

        //Program
        System.out.println("Contoh If Tiga Kasus");
        System.out.print("Suhu (Derajat Celcius) : ");

        //Scanner Untuk Memasukkan Suhu Air
        Scanner ScanInput = new Scanner(System.in);
        T = ScanInput.nextInt(); //Memasukkan Suhu Air dengan Tipe: int (Integer)

        //Proses Pengecekan Dengan IF
        if (T < 0) {
            System.out.println("Wujud Air Beku: " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud Air Cair: " + T);
        } else if (T > 100) {
            System.out.println("Wujud Air Uap/Gas: " + T);
        }
    }
}
