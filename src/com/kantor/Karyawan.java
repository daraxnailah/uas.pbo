package com.kantor;

public class Karyawan extends Pegawai {
    private final double gajiPokok = 1500000;
    private final double transport = 250000;
    private final double lemburJam = 5000;
    private final double tunjanganIstri = 200000;
    private final double tunjanganAnak1 = 60000;
    private final double tunjanganAnakLebih = 130000;
    
    public Karyawan(String nama, String kode, int presensi){
        super(nama, kode, presensi);
    }
    @Override
    public void hitungGaji(){
        double gaji = gajiPokok;
        if (presensi > 7){
            gaji -= (presensi - 7) * 100000;
        }
        if (presensi < 16){
            gaji -= (16 - presensi) * 100000;
        }
        gaji += transport;
        gaji += lemburJam * (presensi > 16 ? presensi - 16 : 0);
        gaji += tunjanganIstri;
        gaji += (presensi > 16 ? (presensi - 16) * tunjanganAnakLebih : 0);
        
        totalGaji = gaji;
    }
}

