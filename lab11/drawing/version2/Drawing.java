package drawing.version2;

import java.util.ArrayList;
import java.util.Objects;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Drawing {
	private ArrayList<Object> shapes = new ArrayList<Object>();

	public double calculateTotalArea(){
		double totalArea = 0;
		for (Object shape : shapes ) {
			System.out.println(shape.getClass());
			if (shape instanceof Circle) {
				totalArea += ((Circle) shape).area();
			}
			else if (shape instanceof Rectangle) {
				totalArea += ((Rectangle) shape).area();
			}
			else if (shape instanceof Square) {
				totalArea += ((Square) shape).area();
			}
		}
		return totalArea;
	}

	public void addShape(Object object) {
		shapes.add(object);
	}

}