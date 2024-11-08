package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame{ // to su dugmici i sve
	
	//iznad konstruktora
	private DrawingView view = new DrawingView();
	private DrawingController controller;
	

	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.mouseClicked(e);
			}
		});
		
		//JPanel panel = new JPanel(); - gde god nadjemo panel menjamo u view!! u skladu sa novom arhitekturom.
		getContentPane().add(view, BorderLayout.CENTER);
	}

	public DrawingView getView() {
		return view;
	}
	
	public void setController(DrawingController controller) {
		this.controller = controller;
	
	}
}
//jedino sto mozemo u ovim metodama u frame-u da imamo je da pozivamo iz kontrolera. moze imati gettere i setere