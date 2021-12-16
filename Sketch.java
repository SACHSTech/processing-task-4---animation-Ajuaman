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

    // Percentage through it's cycle
    float percentageOne = (float) (((angleOne / (2 * Math.PI)) * 200) + 30) % 200;
    // Calculates the brightness
    float difference1 = Math.abs(percentageOne - 100);

    float percentageTwo = (float) (((angleOne / (2 * Math.PI)) * 1300) + 10) % 1300;
    float difference2 = Math.abs(percentageTwo - 255);

    // Use HSB colour picker mode
    colorMode(HSB, 360, 100, 100);
    background(42, 100, (int) (difference1 * 0.7));
    colorMode(RGB, 255, 255, 255);
    
    // ADDS STARS WHEN THE BRIGHTNESS IS A CERTAIN VALUE
    if(difference1 < 30){
      // ADDING STARS
      fill(255, 255, 255, difference2);
      ellipse(10, 10, 10, 10);
      ellipse(100, 100, 10, 10);
      ellipse(244, 23, 10, 10);
      ellipse(154, 124, 10, 10);
      ellipse(321, 24, 10, 10);
      ellipse(453, 83, 10, 10);
      ellipse(490, 83, 10, 10);
      ellipse(260, 100, 10, 10);
      fill(148, 146, 142);
    }

    float circleYOne = constantOne + sin((float) angleOne) * scalarY;
    float circleXOne = constantOne + cos((float) angleOne) * scalarX;

    float circleXTwo = constantTwo + cos((float) angleTwo) * scalarX;
    float circleYTwo = constantTwo + sin((float) angleTwo) * scalarY;

    // SUN
    fill(240, 169, 62);
    ellipse(circleXOne, circleYOne, 50, 50);
    
    // MOON
    ellipse(circleXTwo, circleYTwo, 50, 50);

    angleOne = angleOne + speed;
    angleTwo = angleTwo + speed;
  }
}