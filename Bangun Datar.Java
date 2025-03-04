// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Bikin objek dari masing-masing bangun datar
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(3, 4);

        // Cetak hasil luas dan keliling dari setiap bangun datar
        System.out.println("Persegi: Luas = " + persegi.luas() + ", Keliling = " + persegi.keliling());
        System.out.println("Lingkaran: Luas = " + lingkaran.luas() + ", Keliling = " + lingkaran.keliling());
        System.out.println("Segitiga: Luas = " + segitiga.luas() + ", Keliling = " + segitiga.keliling());
    }
}

// Kelas induk BangunDatar
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

// Kelas Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
