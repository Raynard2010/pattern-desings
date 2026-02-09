package model;

import state.IdleState;
import state.State;

public class Chef {
	private String name;
	
	// simpan state
	private State state;

	public Chef(String name) {
		super();
		this.name = name;
		this.state = new IdleState(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
