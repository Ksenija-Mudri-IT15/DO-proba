package mvc;

import java.util.ArrayList;

public class DrawingModel {

	private ArrayList<Shape> shapes = new ArrayList<Shape>(); // mi cemo shapes listu praviti, a ne point
	
	public void add(Shape p) {
		shapes.add(p);
	}
	public void remove(Shape p) {
		shapes.remove(p);
	}
	
	
	//metode za preuzimanje jednog oblika i cele liste
	
	public Shape get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
	
}
