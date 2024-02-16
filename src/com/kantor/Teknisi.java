package com.kantor;

public class Teknisi extends Pegawai {
    private final double gajiPokok = 3000000;
    private final double transport = 500000;
    private final double lemburJam = 5000;
    private final double tunjanganIstri = 200000;
    private final double tunjanganAnak1 = 75000;
    private final double tunjanganAnakLebih = 150000;
    
    public Teknisi(String nama, String kode, int presensi){
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
