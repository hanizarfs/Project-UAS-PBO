package jenisRoti;

import modalRoti.Roti;
import varianRoti.Varian1;
import varianRoti.Varian2;
import varianRoti.Varian3;

/**
 *
 * @author hanizar
 */
public class Pizza extends Roti implements Varian1 {

    // Atribut untuk menerima data varian (total bahan, dan total harga)
    public double totalBahanVarian;
    public double totalHargaVarian;

    // Atribut untuk membuat format table
    private final String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s ||\n";
    private final String strFormatTotal = "||%1$-28s %2$-16s %3$-17s||\n";
    private final String formatBil = "%1$-30s %2$-20s %3$-20s\n";

    // Method untuk menghitung banyaknya bahan yang harus disediakan
    @Override
    public double totalBahanAdonanRoti() {
        double total = this.tepung + this.gula + this.butter + this.ragi + this.susuBubuk + this.susuCair + this.telur + this.esBatu;
        return total;
    }

    public double totalBahanVarian1() {
        double total = this.keju + this.sosis + this.smokedBeef + this.bawangBombay;
        return total;
    }


    // Method untuk menghitung harga dari bahan yang harus disediakan
    @Override
    public double totalHargaAdonanRoti() {
        double total = this.hargaTepung + this.hargaGula + this.hargaButter + this.hargaRagi + this.hargaSusuBubuk + this.hargaSusuCair + this.hargaTelur + this.hargaEsBatu;
        return total;
    }

    @Override
    public double totalHargaVarian1() {
        double total = this.hargaKeju + this.hargaSosis + this.hargaSmokedBeef + this.hargaBawangBombay;
        return total;
    }

    // Method untuk menampilkan hasil
    @Override
    public void tampilHasil() {

        // Atribut untuk menghitung berat (gram) bahan
        this.tepung = this.jumlah / 10.26315789473684 * 1000;
        this.gula = this.jumlah / 10.26315789473684 * 100;
        this.butter = this.jumlah / 10.26315789473684 * 100;
        this.ragi = this.jumlah / 10.26315789473684 * 20;
        this.susuBubuk = this.jumlah / 10.26315789473684 * 200;
        this.susuCair = this.jumlah / 10.26315789473684 * 180;
        this.telur = this.jumlah / 10.26315789473684 * 50;
        this.esBatu = this.jumlah / 10.26315789473684 * 300;
        this.keju = this.jumlah / 1 * 30;
        this.coklat = this.jumlah / 1 * 10;
        this.redBean = this.jumlah / 1 * 10;
        this.krimVanilla = this.jumlah / 1 * 5;
        this.sosis = this.jumlah / 1 * 50;
        this.smokedBeef = this.jumlah / 1 * 50;
        this.bawangBombay = this.jumlah / 1 * 30;

        // Atribut untuk menghitung harga (rupiah) bahan
        this.hargaTepung = this.jumlah / 10.26315789473684 * 1000 / 1000 * 40000;
        this.hargaGula = this.jumlah / 10.26315789473684 * 100 / 1000 * 25000;
        this.hargaButter = this.jumlah / 10.26315789473684 * 100 / 500 * 23000;
        this.hargaRagi = this.jumlah / 10.26315789473684 * 20 / 11 * 5000;
        this.hargaSusuBubuk = this.jumlah / 10.26315789473684 * 200 / 1000 * 39000;
        this.hargaSusuCair = this.jumlah / 10.26315789473684 * 180 / 1000 * 24000;
        this.hargaTelur = this.jumlah / 10.26315789473684 * 50 / 1000 * 23000;
        this.hargaEsBatu = this.jumlah / 10.26315789473684 * 300 / 1000 * 2000;
        this.hargaKeju = this.jumlah / 1 * 30 / 250 * 31000;
        this.hargaCoklat = this.jumlah / 1 * 10 / 500 * 29000;
        this.hargaRedBean = this.jumlah / 1 * 10 / 500 * 25000;
        this.hargaKrimVanilla = this.jumlah / 1 * 5 / 500 * 30000;
        this.hargaSosis = this.jumlah / 1 * 50 / 1000 * 80000;
        this.hargaSmokedBeef = this.jumlah / 1 * 50 / 1000 * 90000;
        this.hargaBawangBombay = this.jumlah / 1 * 30 / 500 * 40000;

        System.out.println("");
        System.out.println("++===============================================================++");
        System.out.println("||                 * Rincian Adonan Pizza  *                     ||");
        System.out.println("++===============================================================++");
        System.out.println("\n*Bahan Adonan Pizza");
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + Math.round(this.tepung * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaTepung * 100.0) / 100.0);
        System.out.format(strFormat, " 2.", "| Gula", "| " + Math.round(this.gula * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaGula * 100.0) / 100.0);
        System.out.format(strFormat, " 3.", "| Butter", "| " + Math.round(this.butter * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaButter * 100.0) / 100.0);
        System.out.format(strFormat, " 4.", "| Ragi", "| " + Math.round(this.ragi * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaRagi * 100.0) / 100.0);
        System.out.format(strFormat, " 6.", "| Susu Bubuk", "| " + Math.round(this.susuBubuk * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSusuBubuk * 100.0) / 100.0);
        System.out.format(strFormat, " 6.", "| Susu Cair", "| " + Math.round(this.susuCair * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSusuCair * 100.0) / 100.0);
        System.out.format(strFormat, " 7.", "| Telur", "| " + Math.round(this.telur * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaTelur * 100.0) / 100.0);
        System.out.format(strFormat, " 8.", "| Es Batu", "| " + Math.round(this.esBatu * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaEsBatu * 100.0) / 100.0);
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanAdonanRoti() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaAdonanRoti()));
        System.out.println("++-----------------------------+----------------+----------------++");

        if (this.varian == 1) {
            System.out.println("\n*Bahan Varian 1");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormat, " 1.", "| Keju", "| " + Math.round(this.keju * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaKeju * 100.0) / 100.0);
            System.out.format(strFormat, " 2.", "| Sosis", "| " + Math.round(this.sosis * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSosis * 100.0) / 100.0);
            System.out.format(strFormat, " 3.", "| Smoked beef", "| " + Math.round(this.smokedBeef * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSmokedBeef * 100.0) / 100.0);
            System.out.format(strFormat, " 4.", "| Bawang bombay", "| " + Math.round(this.bawangBombay * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaBawangBombay * 100.0) / 100.0);
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanVarian1() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaVarian1()));
            System.out.println("++-----------------------------+----------------+----------------++");
            totalBahanVarian = Math.round(totalBahanVarian1() * 100.0) / 100.0;
            totalHargaVarian = Math.round(totalHargaVarian1() * 100.0) / 100.0;
        }

        double totalBahan = totalBahanAdonanRoti() + this.totalBahanVarian;
        double totalHarga = totalHargaAdonanRoti() + this.totalHargaVarian;
        double hargaJualPerPcs = (totalHarga / this.jumlah * 0.5) + (totalHarga / this.jumlah);
        System.out.println("");
        System.out.println("===================================================================");
        System.out.println("                            BILL RECEIPT");
        System.out.println("===================================================================");
        System.out.format(formatBil, "ITEM", "QTY", "HARGA");
        System.out.println("-------------------------------------------------------------------");
        System.out.format(formatBil, "Bahan Adonan Roti", Math.round(totalBahanAdonanRoti() * 100.0) / 100.0 + " gram", "Rp. " + Math.round(totalHargaAdonanRoti() * 100.0) / 100.0);
        System.out.format(formatBil, "Bahan Varian " + this.varian, Math.round(this.totalBahanVarian * 100.0) / 100.0 + " gram", "Rp. " + this.totalHargaVarian);
        System.out.println("                              ___________________________________ +");
        System.out.format(formatBil, "Total ", Math.round(totalBahan * 100.0) / 100.0 + " gram", "Rp. " + Math.round(totalHarga * 100.0) / 100.0);
        System.out.println("===================================================================");
        System.out.println("\nMargin profit 50%");
        System.out.println("Harga Jual 1 pcs Pizza : Rp. " + Math.round(hargaJualPerPcs * 100.0) / 100.0 + "\n\n");
    }

}
