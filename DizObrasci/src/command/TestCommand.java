package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;
import mvc.Shape;

public class TestCommand {

	public static void main(String[] args) {
		
		DrawingModel model = new DrawingModel();
		
		Point p1 = new Point(10, 10, Color.BLACK);
		
		// Testiranje dodavanja tačke
		// model.add(p1);    ---> ne primenujemo na ovaj način, zbog nemogućnosti izvršavanja undo i redo
		AddPointCmd addPointCommand = new AddPointCmd(p1, model);
		
		addPointCommand.execute();
		System.out.println("1. Veličina liste je: " + model.getShapes().size());
		
		addPointCommand.unexecute();
		System.out.println("2. Veličina liste je: " + model.getShapes().size());
		
		addPointCommand.execute();
		System.out.println("3. Veličina liste je: " + model.getShapes().size());

		
		// Testiranje brisanja tačke
		RemovePointCmd removePointCmd = new RemovePointCmd(p1, model);
		
		removePointCmd.execute();
		System.out.println("4. Veličina liste je: " + model.getShapes().size());
		
		removePointCmd.unexecute();
		System.out.println("5. Veličina liste je: " + model.getShapes().size());
		
		
		// Testiranje modifikacije tačke
		Point p2 = new Point(20, 20, Color.BLACK);
		Command updatePointCmd = new UpdatePointCmd(p1, p2);
		
		System.out.println(p1);
		updatePointCmd.execute();
		//p1 = p2;
		System.out.println(p1);
		
		updatePointCmd.unexecute();
		System.out.println(p1);
		
		
		
		// LINIJA
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		Line l1 = new Line(p1, p2, Color.BLACK);
		Line l2 = new Line(p3, p4, Color.BLACK);
		
//		AddLineCmd addLineCmd = new AddLineCmd(l1, model);
//		addLineCmd.execute();
//		System.out.println(model.getShapes());
//		
//		
//		UpdateLineCmd updateLineCmd = new UpdateLineCmd(l1, l2);
//		updateLineCmd.execute();
//		System.out.println(model.getShapes());
	}

}