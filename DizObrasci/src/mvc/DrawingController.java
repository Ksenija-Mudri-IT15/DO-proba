package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawingController {

	private DrawingModel model;
	private DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.BLUE);
		model.add(p); //iscrtava
		//metoda repaint azurira. to znaci da nakon svake promene mora da ima:
		frame.repaint();
	}
	
}
