package com.example.mustafa.kurtakip;

/**
 * Created by Mustafa on 23.11.2015.
 */
public class Kur {
    private String paraBirimi;
    private double alim;
    private double satim;

    public Kur(String paraBirimi, double alim, double satim) {
        this.paraBirimi = paraBirimi;
        this.alim = alim;
        this.satim = satim;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public double getAlim() {
        return alim;
    }

    public void setAlim(double alim) {
        this.alim = alim;
    }

    public double getSatim() {
        return satim;
    }

    public void setSatim(double satim) {
        this.satim = satim;
    }
}
