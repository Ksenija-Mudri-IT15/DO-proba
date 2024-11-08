package command;
import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class AddLineCmd {

	private Line line;
	private DrawingModel model;
	

	public AddLineCmd(Point point, DrawingModel model) {
		this.line = line;
		this.model = model;
	}
	
	public void execute() {
		model.add(line);
	}
	
	public void unexecute() {
		model.remove(line);
	}
	
}
