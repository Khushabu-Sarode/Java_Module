package Draw;

public class Circle implements Drawable {

	private double radius;
	
	public Circle() {
	radius = 0;
	}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void drawshape() {
		// TODO Auto-generated method stub
		 System.out.println("Shape is Circle");
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return radius * PI;
	}

}
