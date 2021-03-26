package com.example.inchiriereautomobile;

import java.io.Serializable;
import java.util.Date;

public class InchiriereAutomobil implements Serializable {

    String nume;
    int nrZileInchiriate;
    String marcaMasina;
    Date dataInchirierii;

    public InchiriereAutomobil(String nume, int nrZileInchiriate, String marcaMasina, Date dataInchirierii) {
        this.nume = nume;
        this.nrZileInchiriate = nrZileInchiriate;
        this.marcaMasina = marcaMasina;
        this.dataInchirierii = dataInchirierii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrZileInchiriate() {
        return nrZileInchiriate;
    }

    public void setNrZileInchiriate(int nrZileInchiriate) {
        this.nrZileInchiriate = nrZileInchiriate;
    }

    public String getMarcaMasina() {
        return marcaMasina;
    }

    public void setMarcaMasina(String marcaMasina) {
        this.marcaMasina = marcaMasina;
    }

    public Date getDataInchirierii() {
        return dataInchirierii;
    }

    public void setDataInchirierii(Date dataInchirierii) {
        this.dataInchirierii = dataInchirierii;
    }

    @Override
    public String toString() {
        return "InchiriereAutomobil{" +
                "nume='" + nume + '\'' +
                ", nrZileInchiriate=" + nrZileInchiriate +
                ", marcaMasina='" + marcaMasina + '\'' +
                ", dataInchirierii=" + dataInchirierii +
                '}';
    }
}
