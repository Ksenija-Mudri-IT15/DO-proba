package command;

import mvc.DrawingModel;
import mvc.Line;

public class RemoveLineCmd {

	private Line line;
	private DrawingModel model;
	
	public RemoveLineCmd(Line line, DrawingModel model) {
		this.line = line;
		this.model = model;
	}

	public void execute() {
		model.remove(line);
	}
	public void unexecute() {
		model.add(line);
	}

	
	
	
}
