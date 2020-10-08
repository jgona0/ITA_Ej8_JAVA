package com.cohets.view;

import java.util.ArrayList;
import java.util.List;

import com.cohets.cohet.*;

public class MainApp {

	public static void main(String[] args) {

		// Creamos y añadimos la lista de propulsores
		List<Integer> props1 = new ArrayList <Integer>();
		List<Integer> props2 = new ArrayList <Integer>();
		
		props1.add(10);
		props1.add(30);
		props1.add(80);
		
		props2.add(30);
		props2.add(40);
		props2.add(50);
		props2.add(50);
		props2.add(30);
		props2.add(10);
		
		// Cremaos los cohetes
		Cohet c1 = new Cohet("32WESSDS", props1);
		Cohet c2 = new Cohet("LDSFJA32", props2);
		
		// Imprimimos la información de los cohetes
		System.out.println("--- FASE 2 ---");
		System.out.println("Cohet #:" +c1.getId()+ ", Num props:" +c1.getNumProps() +", Potencias: " +c1.getAllPotencias());
		System.out.println("Cohet #:" +c2.getId()+ ", Num props:" +c2.getNumProps() +", Potencias: " +c2.getAllPotencias());
		
		
	}

}
