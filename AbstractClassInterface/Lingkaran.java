package AbstractClassInterface;

public class Lingkaran extends BangunDatar implements Hitung{

    private double jari;
    private final double pi = 3.14;

    public Lingkaran() {

    }

    public Lingkaran(String nama, double jari) {
        super(nama);
        this.jari = jari;

    }

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void info() {
        System.out.printf("Nama bangun datar     : %s\n", getNama());
        System.out.printf("Panjang Jari-Jari     : %.2f\n", jari);
        System.out.printf("Luas                  : %.2f\n", hitungLuas());
        System.out.printf("Keliling              : %.2f\n", hitungKeliling() );
        System.out.printf("Nilai Spesial         : %.2f\n\n", hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return pi * Math.pow(jari,2);
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jari;
    }

    @Override
    public double hitungSpesial() {
        //rumus luas tembereng = luas juring - luas segitiga
        //rumus luas juring = 90/360 * luas lingkaran
        return (hitungLuas()/4) - (Math.pow(jari,2)/2);
    }
}
