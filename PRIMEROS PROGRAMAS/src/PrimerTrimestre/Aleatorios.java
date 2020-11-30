package PrimerTrimestre;

import java.util.*;

public class Aleatorios {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		Random numAleatorio;
		numAleatorio=new Random();
		valor=numAleatorio.nextInt(100)+1;//(100)=0-99;(100)+1=1-100
		System.out.println("nº: "+valor);
	}

}
