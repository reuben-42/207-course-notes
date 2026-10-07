/** Class that describes the dimensions of a Rectangle and can change its size. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a Rectangle object with width {@code w} and height {code h}.
   *
   * @param w the width of the Rectangle
   * @param h the height of the Rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of the Rectangle.
   *
   * @return {@code width * height}, which is the area of the Rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor a decimal value indicating how much the Rectangle should be enlarged or shrank
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns {@code true} if this Rectangle is larger than Rectangle {@code other}.
   *
   * @param other a Rectangle object
   * @return {@code true} if this Rectangle is larger than {@code other}, {@code false} otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
