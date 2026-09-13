package Draw;

public class Rectangle implements Drawable {
  
	private double len,bre;
	
	public Rectangle() {
		len = 0;
		bre = 0;
	}
	
	
	public Rectangle(double len, double bre) {
		super();
		this.len = len;
		this.bre = bre;
	}

	
	
	
	@Override
	public void drawshape() {
		// TODO Auto-generated method stub
       System.out.println("Shape is Reactangle");
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return len*bre;
	}

}
