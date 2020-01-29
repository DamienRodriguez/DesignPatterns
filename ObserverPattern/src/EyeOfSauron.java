import java.util.Observable;
public class EyeOfSauron extends Observable {
   private int numOfHobbits;
   private int numOfElves;
   private int numOfDwarves;
   private int numOfMen;



   public void setEnemies(final GoodGuys goodGuys) {
      this.numOfHobbits = goodGuys.getHobbits();
      this.numOfElves = goodGuys.getElves();
      this.numOfDwarves = goodGuys.getDwarves();
      this.numOfMen = goodGuys.getMen();
      
      this.setChanged();
      this.notifyObservers();
   }
   
   public int getMen() { return this.numOfMen; }
   public int getHobbits() { return this.numOfHobbits; }
   public int getElves() { return this.numOfElves; }
   public int getDwarves() { return this.numOfDwarves; }
   
   
   
}