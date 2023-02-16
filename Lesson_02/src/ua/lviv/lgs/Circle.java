package ua.lviv.lgs;

public class Circle {
      private double radius;
      private double diameter;
       public Circle() {
    	   this.radius = 12.14;
       }
       public Circle (double diameter) {
     	  this.diameter = diameter;
       }
      public double getRadius() {
		return radius;
	}
	public double getDiameter() {
		return diameter;
	}
	
	public double countAreaCircle(double diameter) {
		double cirarea = (Math.PI*diameter*diameter)/4;
		return cirarea;
	}
	public double countLengthCircle(double radius) {
		double cirlength = 2*Math.PI*radius;
		return cirlength;
	}
	
}
