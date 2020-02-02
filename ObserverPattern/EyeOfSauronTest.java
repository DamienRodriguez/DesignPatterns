public class EyeOfSauronTest {
   public static void main(String args[]) {
      EyeOfSauron eye = new EyeOfSauron();
      BadGuys saruman = new BadGuys(eye,"Saruman");
      GoodGuys goodGuys = new GoodGuys(1,1,2,0);
      
      eye.setEnemies(goodGuys);
      saruman.defeated();
   
      System.out.println("THATS ALL FOLKS!");
   
   
   
   
   }

}