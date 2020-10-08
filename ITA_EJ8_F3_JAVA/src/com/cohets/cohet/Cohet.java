package com.cohets.cohet;

import java.util.ArrayList;
import java.util.List;

public class Cohet {

	// Varaibles de clase
	private String id;
	private List<Integer> props_max = new ArrayList<Integer>();
	private List<Integer> props_act = new ArrayList<Integer>();
	
	
	//CONSTRUCTOR
	public Cohet(String id, List<Integer> props_max) {
		
		this.id = id;
		this.props_max = props_max;
		
		//llenamos una list del mismo tamaño que los propulsores, con las potencias actuales iniciales, es decir, 0
		for(int i=0; i<props_max.size();i++) {
			props_act.add(0);
		}
		
	}
	
	
	// 
	public void acelera(int propulsor) throws Exception{
		
		// recuperamos las potencias actuales y maximas del propulsor
		int potencia_act = props_act.get(propulsor);
		int potencia_max = props_max.get(propulsor);
		
		// si la potencia actual es máxima, ya no podemos acelerarlo más
		if (potencia_act == potencia_max) throw new Exception();  
		
		// aceleramos el propulsor de 1 en 1 y hacemos el sleep para que se pueda ir viendo en pantalla
		while (potencia_act<potencia_max){
			
			System.out.println("ACELERANDO - Cohete:" +id+ "  - Hilo:" +Thread.currentThread()+ "  - Potencia:" +potencia_act);
			potencia_act++;
			props_act.set(propulsor, potencia_act);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//una vez acabado imprimimos que el propulsor está en potencia máxima
		System.out.println("MAX POTENCIA - Cohete:" +id+ "  - Hilo:" +Thread.currentThread()+ "  - Potencia:" +potencia_act);
		
	}
	
	public void frena(int propulsor) throws Exception {
		
		// recuperamos la potencia actual
		int potencia_act = props_act.get(propulsor);
		
		// si la potencia actual es máxima, ya no podemos acelerarlo más
		if (potencia_act == 0) throw new Exception();  
			
		// frenamos el propulsor de 1 en 1 y hacemos el sleep para que se pueda ir viendo en pantalla
		while (potencia_act>0){
			
			System.out.println("FRENANDO - Cohete:" +id+ "  - Hilo:" +Thread.currentThread()+ "  - Potencia:" +potencia_act);
			potencia_act--;
			props_act.set(propulsor, potencia_act);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//una vez acabado imprimimos que el propulsor está en potencia máxima
		System.out.println("MIN POTENCIA - Cohete:" +id+ "  - Hilo:" +Thread.currentThread()+ "  - Potencia:" +potencia_act);
	}
	
	
	// GETTERS
	public String getId() {
		return id;
	}
	
	
	public int getNumProps() {
		return props_max.size();
	}
	
	public int getPotenciaMax(int prop) {
		return props_max.get(prop);
	}
	
	public int getPotenciaAct(int prop) {
		return props_act.get(prop);
	}
	
	public String getAllPotencias() {
		
		String potencias="";
		
		for(int i=0; i<props_max.size(); i++) {
			potencias += props_max.get(i)+ ", ";
		}
		
		return potencias;
	}
	
	public String getAllPotenciasActs() {
		
		String potencias="";
		
		for(int i=0; i<props_act.size(); i++) {
			potencias += props_act.get(i)+ ", ";
		}
		
		return potencias;
	}
}
