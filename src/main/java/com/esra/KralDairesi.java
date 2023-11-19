package com.esra;

class KralDairesi extends KonaklamaYeri {
    private int yatakSayisi;
    private boolean jakuzi;

    public KralDairesi(int odaNo, double ucret, int yatakSayisi, boolean jakuzi) {
        super(odaNo, ucret);
        this.yatakSayisi = yatakSayisi;
        this.jakuzi = jakuzi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Kral Dairesi Bilgisi: Oda No - " + getOdaNo() +
                ", Ücret - " + getUcret() + " TL, Yatak Sayısı - " + yatakSayisi +
                ", Jakuzi - " + (jakuzi ? "Var" : "Yok"));
    }

    @Override
    public void rezervasyonYap(Musteri musteri) {
        if (!isRezerveDurumu()) {
            setRezerveDurumu(true);
            System.out.println("Kral Dairesi rezervasyonu yapıldı: Oda No - " + getOdaNo() + " - Müşteri: " + musteri);
        } else {
            System.out.println("Kral Dairesi zaten rezerve edilmiş.");
        }
    }
}

