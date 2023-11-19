package com.esra;
class Otel implements Odeme {
    private KonaklamaYeri[] konaklamaYerleri;
    private Musteri[] musteriler;

    public Otel() {
        this.konaklamaYerleri = new KonaklamaYeri[10];
        this.musteriler = new Musteri[10];
        initializeKonaklamaYerleri();
    }

    private void initializeKonaklamaYerleri() {
        konaklamaYerleri[0] = new Oda(101, 150.0, 2);
        konaklamaYerleri[1] = new KralDairesi(201, 500.0, 3, true);
        konaklamaYerleri[2] = new VIPSuite(301, 300.0, 2, true);
    }

    public KonaklamaYeri[] bosKonaklamaYerleriListele() {
        int bosYerSayisi = 0;
        for (KonaklamaYeri konaklamaYeri : konaklamaYerleri) {
            if (konaklamaYeri != null && !konaklamaYeri.isRezerveDurumu()) {
                bosYerSayisi++;
            }
        }

        KonaklamaYeri[] bosKonaklamaYerleri = new KonaklamaYeri[bosYerSayisi];
        int index = 0;
        for (KonaklamaYeri konaklamaYeri : konaklamaYerleri) {
            if (konaklamaYeri != null && !konaklamaYeri.isRezerveDurumu()) {
                bosKonaklamaYerleri[index++] = konaklamaYeri;
            }
        }
        return bosKonaklamaYerleri;
    }

    public void rezervasyonYap(int odaNo, Musteri musteri) {
        for (KonaklamaYeri konaklamaYeri : konaklamaYerleri) {
            if (konaklamaYeri != null && konaklamaYeri.getOdaNo() == odaNo && !konaklamaYeri.isRezerveDurumu()) {
                konaklamaYeri.rezervasyonYap(musteri);
                return;
            }
        }
        System.out.println("Belirtilen konaklama yeri bulunamadı veya rezerve edilebilecek durumda değil.");
    }

    @Override
    public void odemeYap(double tutar, OdemeTipi odemeTipi) {
        Fatura fatura = new Fatura(tutar, odemeTipi);
        System.out.println("Ödeme yapıldı - Fatura Bilgisi: " + fatura);
    }
}


