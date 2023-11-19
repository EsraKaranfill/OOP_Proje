package com.esra;

public class Fatura {
    private double tutar;
    private OdemeTipi odemeTipi;

    public Fatura(double tutar, OdemeTipi odemeTipi) {
        this.tutar = tutar;
        this.odemeTipi = odemeTipi;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public OdemeTipi getOdemeTipi() {
        return odemeTipi;
    }

    public void setOdemeTipi(OdemeTipi odemeTipi) {
        this.odemeTipi = odemeTipi;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "tutar=" + tutar +
                ", odemeTipi=" + odemeTipi +
                '}';
    }
}
