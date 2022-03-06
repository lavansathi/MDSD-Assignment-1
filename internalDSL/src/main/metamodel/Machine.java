package main.metamodel;

import java.util.*;
import java.util.*;

public class Machine {
	
	private List<State> states = new ArrayList<>();
	private State initialState;
	private Map<String, Integer> variable = new HashMap<>();

	
	public Machine(Collection<State> states, State initialState, Collection<String> variable) {
		
		this.states.addAll(states);
		this.initialState = initialState;
		for(String name : variable) {
			this.variable.put(name, 0);
		}
	}

	public List<State> getStates() {		
		return states;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getState(String string) {
		// TODO Auto-generated method stub
		return states.get(states.indexOf(string)+1);
		
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return true;
	}

}
