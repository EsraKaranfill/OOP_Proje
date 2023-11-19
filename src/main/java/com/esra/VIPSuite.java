package com.esra;

class VIPSuite extends KonaklamaYeri {
    private int yatakSayisi;
    private boolean denizManzarasi;

    public VIPSuite(int odaNo, double ucret, int yatakSayisi, boolean denizManzarasi) {
        super(odaNo, ucret);
        this.yatakSayisi = yatakSayisi;
        this.denizManzarasi = denizManzarasi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("VIP Suite Bilgisi: Oda No - " + getOdaNo() +
                ", Ücret - " + getUcret() + " TL, Yatak Sayısı - " + yatakSayisi +
                ", Deniz Manzarası - " + (denizManzarasi ? "Var" : "Yok"));
    }

    @Override
    public void rezervasyonYap(Musteri musteri) {
        if (!isRezerveDurumu()) {
            setRezerveDurumu(true);
            System.out.println("VIP Suite rezervasyonu yapıldı: Oda No - " + getOdaNo() + " - Müşteri: " + musteri);
        } else {
            System.out.println("VIP Suite zaten rezerve edilmiş.");
        }
    }
}


