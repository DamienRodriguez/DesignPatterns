import java.util.Observer;
import java.util.Observable;
public class BadGuys implements Observer {

   private EyeOfSauron eye;
   private String name;
   
   public BadGuys(final EyeOfSauron eye, final String name) {
      setEye(eye);
      setName(name);
      this.eye.addObserver(this);
   
   }
   
   public void setEye(final EyeOfSauron eye) {
      this.eye = eye;
   }
   
   public void setName(final String name) {
      this.name = name;
   }
   
   public void defeated() {
      System.out.println(this.name + " has been defeated by the forces of good!");
      this.eye.deleteObserver(this);
   }
   
   
   @Override
   public void update(Observable o, Object arg) {
      this.eye =(EyeOfSauron)o;
      System.out.println(this.name + " is aware of the " + eye.getHobbits() + " hobbits, the " + eye.getElves() + " elves, the " + eye.getDwarves() + " dwarves, and the " + eye.getMen() + " men.");
   }
   
   
}