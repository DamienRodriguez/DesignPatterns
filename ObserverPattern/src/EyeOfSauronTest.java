public class EyeOfSauronTest {

   public static void main(String args[]) {
   
      EyeOfSauron eye = new EyeOfSauron();
      BadGuys saruman = new BadGuys(eye,"Saruman");
      BadGuys witchking = new BadGuys(eye, "Witch King");
      GoodGuys goodGuys = new GoodGuys(1,1,2,0);
      
      eye.setEnemies(goodGuys);
      saruman.defeated();
      
      goodGuys.setHobbits(4);
      goodGuys.setElves(2);
      goodGuys.setDwarves(2);
      goodGuys.setMen(100);
      
      eye.setEnemies(goodGuys);
      
   }
}