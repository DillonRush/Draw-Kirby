import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  KirbyPainter kirb = new KirbyPainter();
MuralPainter back = new MuralPainter();
    
//paints a blue background
    back.paintBackground("cyan", 16);

// paints kirby
kirb.drawKirby();
  
  System.out.println("Poyo!");
  }
}