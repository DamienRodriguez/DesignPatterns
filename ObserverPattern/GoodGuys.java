public class GoodGuys {

   //this data class was implemented to keep magic numbers 
   //out of my main method within the context of the assignment
   
   private int numOfMen;
   private int numOfElves;
   private int numOfDwarves;
   private int numOfHobbits;
   
   public GoodGuys(final int hobbits, final int elves, final int dwarves, final int men) {
      setMen(men);
      setElves(elves);
      setDwarves(dwarves);
      setHobbits(hobbits);
   }

   public void setMen(final int men) {
      this.numOfMen = men;
   }
   
   public void setElves(final int elves) {
      this.numOfElves = elves;
   }
   
   public void setDwarves(final int dwarves) {
      this.numOfDwarves = dwarves;
   }
   
   public void setHobbits(final int hobbits) {
      this.numOfHobbits = hobbits;
   }
   
   public int getMen() {
      return this.numOfMen;
   }
   
   public int getElves() {
      return this.numOfElves;
   }
   
   public int getDwarves() {
      return this.numOfDwarves;
   }
   
   public int getHobbits() {
      return this.numOfHobbits;
   }

}