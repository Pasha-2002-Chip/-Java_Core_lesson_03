package ua.lviv.lgs;

public class Aplication {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(12, 25);
		
		System.out.println("Площа прямокутника 1 = " + rec1.countArea(rec1.getWidth(), rec1.getLength()));
		System.out.println("Периметр прямокутника 1 = " + rec1.countPerimeter(rec1.getWidth(), rec1.getLength()));
		
		System.out.println("Площа прямокутника 2 = " + rec2.countArea(rec2.getWidth(), rec2.getLength()));
		System.out.println("Периметр прямокутника 2 = " + rec2.countPerimeter(rec2.getWidth(), rec2.getLength()));

		Circle cir1 =new Circle();
		Circle cir2 =new Circle(32.12);
		
		System.out.println("Довжина кола 1 = " + cir1.countLengthCircle(cir1.getRadius()));
		System.out.println("Площа кола 2  = " + cir2.countAreaCircle(cir2.getDiameter()));
		
	}
}
