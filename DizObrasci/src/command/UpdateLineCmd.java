
package command;

import mvc.Line;

public class UpdateLineCmd implements Command {
	private Line line;
	private Line newState;
	private Line oldState = new Line();
	
	public UpdateLineCmd(Line line, Line newState) {
		this.line = line;
		this.newState = newState;
	}

	@Override
	public void execute() {
		oldState.getStartPoint().setX(line.getStartPoint().getX());
		oldState.getStartPoint().setY(line.getStartPoint().getY());
		oldState.getEndPoint().setX(line.getEndPoint().getX());
		oldState.getEndPoint().setY(line.getEndPoint().getY());
		oldState.setColor(line.getColor());
		
		line.getStartPoint().setX(newState.getStartPoint().getX());
		line.getStartPoint().setY(newState.getStartPoint().getY());
		line.getEndPoint().setX(newState.getEndPoint().getX());
		line.getEndPoint().setY(newState.getEndPoint().getY());
		line.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		line.getStartPoint().setX(oldState.getStartPoint().getX());
		line.getStartPoint().setY(oldState.getStartPoint().getY());
		line.getEndPoint().setX(oldState.getEndPoint().getX());
		line.getEndPoint().setY(oldState.getEndPoint().getY());
		line.setColor(oldState.getColor());

	}

}
