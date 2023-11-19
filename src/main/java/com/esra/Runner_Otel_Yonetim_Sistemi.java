package com.esra;

public class Runner_Otel_Yonetim_Sistemi {
    public static void main(String[] args) {
        Otel otel = new Otel();

        System.out.println("Boş Konaklama Yerleri:");
        KonaklamaYeri[] bosYerler = otel.bosKonaklamaYerleriListele();
        for (KonaklamaYeri konaklamaYeri : bosYerler) {
            System.out.println(konaklamaYeri);
        }

        Musteri musteri = new Musteri("Ahmet", "Vural");
        otel.rezervasyonYap(201, musteri);

        System.out.println("\nRezerve Edilen Konaklama Yerleri:");
        KonaklamaYeri[] rezerveYerler = otel.bosKonaklamaYerleriListele();
        for (KonaklamaYeri konaklamaYeri : rezerveYerler) {
            System.out.println(konaklamaYeri);
        }

        otel.odemeYap(500.0, OdemeTipi.NAKIT);

    }
}