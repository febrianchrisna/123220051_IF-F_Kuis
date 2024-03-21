/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalbeli;

/**
 *
 * @author Lab Informatika
 */
public class TotalPembelian {
    int banyakMajalah,hargaSatuan;

    public TotalPembelian(int banyakMajalah, int hargaSatuan) {
        this.banyakMajalah = banyakMajalah;
        this.hargaSatuan = hargaSatuan;
    }

    public int getBanyakMajalah() {
        return banyakMajalah;
    }

    public void setBanyakMajalah(int banyakMajalah) {
        this.banyakMajalah = banyakMajalah;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    
    public int PembelianTotal(){
        return banyakMajalah*hargaSatuan;
    }
}
