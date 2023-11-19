package com.esra;
    abstract class KonaklamaYeri {
        private final int odaNo;
        private boolean rezerveDurumu;
        private double ucret;

        public KonaklamaYeri(int odaNo, double ucret) {
            this.odaNo = odaNo;
            this.ucret = ucret;
            this.rezerveDurumu = false;
        }

        public int getOdaNo() {
            return odaNo;
        }

        public boolean isRezerveDurumu() {
            return rezerveDurumu;
        }

        public void setRezerveDurumu(boolean rezerveDurumu) {
            this.rezerveDurumu = rezerveDurumu;
        }

        public double getUcret() {
            return ucret;
        }

        // Abstract metotlar
        public abstract void bilgiGoster();

        public abstract void rezervasyonYap(Musteri musteri);

        @Override
        public String toString() {
            return "Oda No: " + odaNo +
                    ", Ücret: " + ucret +
                    ", Rezerve Durumu: " + (rezerveDurumu ? "Rezerve Edildi" : "Rezerve Edilmedi");
        }
    }

