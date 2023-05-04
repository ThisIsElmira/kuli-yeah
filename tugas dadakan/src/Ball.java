public class Ball
{
   public int r;

   public Ball()
   {
      this.r = r;
   }
   public double hitungLuas()
   {
      return 4*Math.PI*r*r;
   }

   public double hitungVolume()
   {
      return 4.0/3.0*Math.PI*r*r*r;
   }
}
