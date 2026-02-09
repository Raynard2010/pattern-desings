package state;

import model.Chef;

public abstract class State {
	// simpan context
	protected Chef chef;

	public State(Chef chef) {
		super();
		this.chef = chef;
	}
	
	// method
	public abstract void handle();
}
