package com.kantor;

public class Main {
    public static void main(String[] args) {
        Pegawai supervisor = new Supervisor("Odi", "SPV", 10);
        Pegawai hrd = new HRD("Steve", "HRD", 15);
        Pegawai teknisi = new Teknisi("Surya", "TKN", 18);
        Pegawai karyawan = new Karyawan("Soobin", "KRY", 8);
        
        supervisor.hitungGaji();
        hrd.hitungGaji();
        teknisi.hitungGaji();
        karyawan.hitungGaji();
        
        System.out.println("Gaji Supervisor " + supervisor.nama + ": " + supervisor.totalGaji);
        System.out.println("Gaji HRD " + hrd.nama + ": " + hrd.totalGaji);
        System.out.println("Gaji Teknisi " + teknisi.nama + ": " + teknisi.totalGaji);
        System.out.println("Gaji Karyawan " + karyawan.nama + ": " + karyawan.totalGaji);
    }
}
