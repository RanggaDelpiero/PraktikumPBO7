package AbstractClassInterface;

public class Main {

    public static void main(String[] args) {

        BangunDatar bd[] = new BangunDatar[7];
        bd[0] = new Lingkaran("Lingkaran", 37);
        bd[1] = new Trapesium("Trapesium", 24,77,40);
        bd[2] = new Segitiga ("Segitiga", 56,67);
        bd[3] = new Persegi("Persegi", 33);
        bd[4] = new Layang("Layang", 30,12,8,7);
        bd[5] = new Trapesium("Trapesium", 10,35,8);
        bd[6] = new Layang("Layang", 12,24,7,9);

        BangunDatar b = new fungsiBangunDatar();
        b.info();
        for (int i = 0; i < bd.length; i++) {
            System.out.printf("================= Bangun Datar %d =================\n", i+1);
            System.out.println("==================================================");
            bd[i].info();
        }

        b.search("layang");
        b.search("LinGkarAn");
        b.search("kubus");
        /*Hitung[] hitungs = new Hitung[5];
        hitungs[0] = new Persegi("persegi", 5);
        hitungs[1] = new Segitiga("segitiga", 5,9);
        hitungs[2] = new Layang("layang", 15,5,6,10);
        hitungs[3] = new Trapesium("trapesium", 5,9,4);
        hitungs[4] = new Lingkaran("lingkaran", 21);

        for(Hitung bangun : hitungs) {
            BangunDatar bangunDatar = BangunDatar.getInstanceBangunDatarOf(bangun);
            bangunDatar.info();
        }*/
    }
}
