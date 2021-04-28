package AbstractClassInterface;

public abstract class BangunDatar {

    private String nama;
    static String[] listBangunDatar = new String[10];

    public BangunDatar(){
    }

    public BangunDatar(String nama) {
        this.nama = nama;
        for (int i = 0; i < 10; i++) {
            if(listBangunDatar[i] == null) {
                listBangunDatar[i] = nama;
                break;
            }
        }
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;

    }

    public abstract void info();

    public void search(String cari) {
        int found = 0;
        for (int i = 0; i < listBangunDatar.length; i++) {
            if(listBangunDatar[i] != null) {
                if (listBangunDatar[i].equalsIgnoreCase(cari)) {
                    found++;
                }
            }
        }
        System.out.println("===============================================");
        System.out.println("Hasil pencarian bangun datar    :");

        if (found != 0) {
            System.out.println("Bangun datar " + cari + " ditemukan!!!");
            System.out.println("Jumlah bangun datar " + cari + " di dalam list : " + found);
            if (cari.equalsIgnoreCase("segitiga")) {
                System.out.println("Sisi bangun datar = 3");
                System.out.println("Sudut bangun datar = 3");
            } else if (cari.equalsIgnoreCase("lingkaran")) {
                System.out.println("Sisi bangun datar = 1");
                System.out.println("Sudut bangun datar = 0");
            } else if (cari.equalsIgnoreCase("persegi")) {
                System.out.println("Sisi bangun datar = 4");
                System.out.println("Sudut bangun datar = 4");
            } else if (cari.equalsIgnoreCase("trapesium")) {
                System.out.println("Sisi bangun datar = 4");
                System.out.println("Sudut bangun datar = 4");
            } else if (cari.equalsIgnoreCase("layang")) {
                System.out.println("Sisi bangun datar = 4");
                System.out.println("Sudut bangun datar = 4");
            }
        } else if (found == 0){
            System.out.println("Bangun datar " + cari + " tidak ada di dalam list");
        }
    }

    public static BangunDatar getInstanceBangunDatarOf  (Hitung bangun) {
        BangunDatar bangunDatar = null;

        if (bangun instanceof Persegi) {
            bangunDatar = (Persegi)bangun;
        } else if (bangun instanceof Segitiga) {
            bangunDatar = (Segitiga)bangun;
        } else if (bangun instanceof Lingkaran) {
            bangunDatar = (Lingkaran)bangun;
        } else if (bangun instanceof Trapesium) {
            bangunDatar = (Trapesium)bangun;
        } else if (bangun instanceof Layang) {
            bangunDatar = (Layang)bangun;
        }
        return bangunDatar;
    }
}
