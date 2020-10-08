package com.cohets.cohet;

import java.util.ArrayList;
import java.util.List;

public class Cohet {

	// variables de clase
	private String id;
	private List<Integer> props = new ArrayList<Integer>();
	
	
	// CONSTRUCTOR
	public Cohet(String id, List<Integer> props) {
		
		this.id = id;
		this.props = props;
		
	}

	
	// GETTERS
	public String getId() {
		return id;
	}
	
	public int getNumProps() {
		return props.size();
	}
	
	public String getAllPotencias() {
		
		String potencias="";
		
		for(int i=0; i<props.size(); i++) {
			potencias += props.get(i)+ ", ";
		}
		
		return potencias;
	}
	

}
