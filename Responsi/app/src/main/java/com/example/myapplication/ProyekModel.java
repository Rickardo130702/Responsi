package com.example.myapplication;

import java.io.Serializable;

public class ProyekModel implements Serializable {
    public String namaAplikasi;
    public String namaTeam;

    public String getNamaAplikasi() {
        return namaAplikasi;
    }

    public void setNamaAplikasi(String namaAplikasi) {
        this.namaAplikasi = namaAplikasi;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }

    public ProyekModel(String namaAplikasi, String namaTeam) {
        this.namaAplikasi = namaAplikasi;
        this.namaTeam = namaTeam;
    }
}
