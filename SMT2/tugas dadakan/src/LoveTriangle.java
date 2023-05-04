public class LoveTriangle {
    int SisiAlas,Tinggi;
    LoveTriangle(int Alas,int Tinggi2){
        SisiAlas =Alas;
        Tinggi = Tinggi2;
    }

     double HitungVolume(){
        int Alas = (int) Math.pow(SisiAlas,2);
        double Volume =  (Alas*Tinggi)/3;
        return Volume;
    }
    double HitungLuas(){
        int Alas = (int) Math.pow(SisiAlas,2);
        double Miring = 0;
        if(SisiAlas > Tinggi){
            Miring = Math.sqrt(Math.pow((SisiAlas/2),2) + Math.pow(Tinggi,2));
        }else if(SisiAlas < Tinggi){
            Miring = Math.sqrt(Math.pow((Tinggi/2),2) + Math.pow(SisiAlas,2));
        }
        double sisi1 = (SisiAlas *Miring)/2;
        double sisi2 = sisi1 * 4;
        return sisi2;
    }
}
