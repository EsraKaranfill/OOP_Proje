package com.esra;

public class Oda extends KonaklamaYeri {
    private int yatakSayisi;

    public Oda(int odaNo, double ucret, int yatakSayisi) {
        super(odaNo, ucret);
        this.yatakSayisi = yatakSayisi;
    }

    public int getYatakSayisi() {
        return yatakSayisi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Oda Bilgisi: Oda No - " + getOdaNo() + ", Ücret - " + getUcret() + " TL, Yatak Sayısı - " + yatakSayisi);
    }

    @Override
    public void rezervasyonYap(Musteri musteri) {
        if (!isRezerveDurumu()) {
            setRezerveDurumu(true);
            System.out.println("Oda rezervasyonu yapıldı: Oda No - " + getOdaNo() + " - Müşteri: " + musteri);
        } else {
            System.out.println("Oda zaten rezerve edilmiş.");
        }
    }
}
