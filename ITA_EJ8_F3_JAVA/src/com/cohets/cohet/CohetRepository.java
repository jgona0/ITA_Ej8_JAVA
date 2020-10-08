package com.cohets.cohet;

import java.util.ArrayList;
import java.util.List;

public class CohetRepository {

	// Generamos una lista de cohetes
	List<Cohet> cohet_list = new ArrayList<Cohet>();

	
	// método para añadir un cohete al repositorio
	public void addCohet (Cohet cohet) {
		
		cohet_list.add(cohet);
	}
	
	
	// Getter para recuperar un cohete del repositorio
	public Cohet getCohet (String id) throws Exception {
		
		for(int i=0; i<cohet_list.size(); i++) {
			
			if(cohet_list.get(i).getId().equalsIgnoreCase(id)) {
				
				return cohet_list.get(i);
			}
			
		}
		throw new Exception();
		
	}

	
}
