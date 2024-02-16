package com.kantor;

public abstract class Pegawai {
    protected String nama;
    protected String kode;
    protected int presensi;
    protected double totalGaji;
    
    public Pegawai(String nama, String kode, int presensi){
        this.nama = nama;
        this.kode = kode;
        this.presensi = presensi;
    }
    public abstract void hitungGaji();
}
