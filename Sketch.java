import processing.core.PApplet;

public class Sketch extends PApplet {

  int constantOne = 300;
  int constantTwo = 300;
  double angleOne = 0.05;
  double angleTwo = 0.05 - Math.PI;
  int scalarX = 300;
  int scalarY = 250;
  double speed = 0.03;

  public void settings() {
    size(600, 200);
  }

  public void setup() {
    smooth();
  }


  public void draw() {
    background(32);
    float circleYOne = constantOne + sin((float) angleOne) * scalarY;
    float circleXOne = constantOne + cos((float) angleOne) * scalarX;

    float circleXTwo = constantTwo + cos((float) angleTwo) * scalarX;
    float circleYTwo = constantTwo + sin((float) angleTwo) * scalarY;
    // SUN
    fill(240, 169, 62);
    ellipse(circleXOne, circleYOne, 50, 50);
    
    // MOON
    fill(148, 146, 142);
    ellipse(circleXTwo, circleYTwo, 50, 50);
    angleOne = angleOne + speed;
    angleTwo = angleTwo + speed;
  }
}