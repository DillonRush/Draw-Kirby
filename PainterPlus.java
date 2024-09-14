import org.code.neighborhood.*;

public class PainterPlus extends Painter {

public void turnRight() {
turnLeft();
turnLeft();
turnLeft();
}

public void takeAllPaint(){
  while (isOnBucket()) {
    takePaint();
  }
}

public void moveFast(){
  while (canMove()) {
    move();
  }
}

public void paintToEmpty(String color){
  while (hasPaint()) {
    paint(color);
    move();
  }
}

public void paintDonut(String color){
  paint(color);
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
}

  public void paintOrPickUp(String color) {
  if (!isOnBucket()) {
   if (hasPaint()) {
     System.out.println("PAINTING");
     paint(color);
   }
  move();
  } else {
   System.out.println("BUCKET!!");
  takeAllPaint();
  }
}
  
}