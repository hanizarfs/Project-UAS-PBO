package modalRoti;

public abstract class Roti {

    // Atribut dari input user
    public int varian;
    public double jumlah;
    public int varian1;
    public int varian2;
    public int varian3;

    // Bahan adonan
    public double tepung;
    public double gula;
    public double butter;
    public double ragi;
    public double susuBubuk;
    public double susuCair;
    public double telur;
    public double esBatu;
    public double keju;
    public double coklat;
    public double redBean;
    public double krimVanilla;
    public double sosis;
    public double smokedBeef;
    public double bawangBombay;

    // Harga bahan adonan
    public double hargaTepung;
    public double hargaGula;
    public double hargaButter;
    public double hargaRagi;
    public double hargaSusuBubuk;
    public double hargaSusuCair;
    public double hargaTelur;
    public double hargaEsBatu;
    public double hargaKeju;
    public double hargaCoklat;
    public double hargaRedBean;
    public double hargaKrimVanilla;
    public double hargaSosis;
    public double hargaSmokedBeef;
    public double hargaBawangBombay;

    // Method untuk menghitung total keseluruhan bahan adonan roti
    public abstract double totalBahanAdonanRoti();

    // Method untuk menghitung total keseluruhan harga adonan roti
    public abstract double totalHargaAdonanRoti();

    // Method menampilkan hasil
    public abstract void tampilHasil();

}
