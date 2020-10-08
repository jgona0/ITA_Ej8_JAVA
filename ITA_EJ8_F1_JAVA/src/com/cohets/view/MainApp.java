package com.cohets.view;

import com.cohets.cohet.Cohet;

public class MainApp {

	public static void main(String[] args) {

		// Creamos dos cohetes
		Cohet c1 = new Cohet("x", 3);
		Cohet c2 = new Cohet("LDSFJA32", 6);
		
		
		// Imprimimos su información
		System.out.println("--- FASE 1 ---");
		System.out.println("Cohet #:" +c1.getId()+ ", Num props:" +c1.getNumProps());
		System.out.println("Cohet #:" +c2.getId()+ ", Num props:" +c2.getNumProps());
		
		
	}

}
