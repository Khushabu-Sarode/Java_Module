package app;

import Draw.Circle;
import Draw.Drawable;
import Draw.Rectangle;

public class DrawableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Drawable[] shapes = {new Rectangle (0,0),new Circle(0)};
		Drawable[] shapes = {new Rectangle (4.55,13.4),new Circle(24)};	
		
				
	   for(Drawable d : shapes) {
		   d.drawshape();
		   System.out.println(d.calArea());
	   }
		
	}

}
