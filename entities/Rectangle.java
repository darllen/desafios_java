package entities;

public class Rectangle {
    public double height;
    public double width;

    public double getArea(double height, double width){
       return this.height * this.width;
    }

    public double getPerimeter(double height, double width){
        return 2 * (this.width + this.height);
    }

    public double getDiaginal(double height, double width){
        double hypotenuse = (Math.pow(this.height, 2)) + (Math.pow(this.width, 2));
        return Math.sqrt(hypotenuse);
    }
}
