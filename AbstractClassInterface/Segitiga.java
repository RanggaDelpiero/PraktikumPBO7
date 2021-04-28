package AbstractClassInterface;

public class Segitiga extends BangunDatar implements Hitung{

    private double alas;
    private double tinggi;

    public Segitiga() {

    }

    public Segitiga (String nama, double alas, double tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;

    }
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void info() {
        System.out.printf("Nama bangun datar     : %s\n", getNama());
        System.out.printf("Tinggi                : %.2f\n", tinggi);
        System.out.printf("Panjang Alas          : %.2f\n", alas);
        System.out.printf("Luas                  : %.2f\n", hitungLuas());
        System.out.printf("Keliling              : %.2f\n", hitungKeliling() );
        System.out.printf("Nilai Spesial         : %.2f\n\n", hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + hitungSpesial();
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
    }
}
