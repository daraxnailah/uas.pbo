package com.kantor;

public class Supervisor extends Pegawai{
    private final double gajiPokok = 10000000;
    private final double transport = 1000000;
    private final double lemburJam = 10000;
    private final double tunjanganIstri = 300000;
    private final double tunjanganAnak1 = 100000;
    private final double tunjanganAnakLebih = 200000;
    
    public Supervisor(String nama, String kode, int presensi){
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
