package mvc;

import javax.swing.JFrame;

public class Application {

	public static void main(String[] args) {
		System.out.println("Dobro dosli na kurs.");
		
		DrawingModel model = new DrawingModel();
		DrawingFrame frame = new DrawingFrame();		
		frame.getView().setModel(model);
		DrawingController controller = new DrawingController(model,frame);
		frame.setController(controller); //posle ovoga je zavrseno uvezivanje
		
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
// ako ne prepoznaje da postoji main, to je do verzije.