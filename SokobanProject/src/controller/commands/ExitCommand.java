package controller.commands;

import view.View;

public class ExitCommand extends Command {
	View view;
	
	public ExitCommand(View view) {
		this.view = view;
	}
	@Override
	public void execute() {
		view.stop();
	}

}
