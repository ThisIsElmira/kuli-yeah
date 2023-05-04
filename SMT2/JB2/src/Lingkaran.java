public class Lingkaran
{
    double phi = Math.PI;
    double r;

    Lingkaran(double r)
    {
        this.r = r;
    }
    double hitungLuas() {
        return phi * r * r;
    }

    double hitungKeliling() {
        return phi * (r * 2);
    }
}