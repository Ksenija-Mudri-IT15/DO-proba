package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel{ // to je centralni deo - panel naseg projekta
	//private DrawingModel model;
	//privremeno pravimo model, izuzetak mvc strukture!!! ne pita na odbrani ali je bitno znati
	private DrawingModel model = new DrawingModel();
	
	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
	//iscrtavanje sa iteratorom - prolazak kroz petlju gde crta sve...
	
	public void paint(Graphics g) {
		Iterator<Shape> it = model.getShapes().iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
	}
	
}
//jedini zadatak view komponente je da prolazi i crta sve