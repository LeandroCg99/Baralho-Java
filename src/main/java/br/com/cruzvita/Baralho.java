package br.com.cruzvita;

import java.util.ArrayList;

public class Baralho {
	private ArrayList<Carta> cartas;
	
	public Baralho() {
		cartas = new ArrayList<Carta>();
		
		String[] nomes = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
		String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
		
		for (String naipe : naipes) {
			for (String nome : nomes) {
				Carta carta = new Carta(nome, naipe);
				cartas.add(carta);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			Carta coringa = new Carta("Coringa", "Coringa");
		            cartas.add(coringa);
		        }
		    }

		    public void embaralharCartas() {
		    	  int n = cartas.size();
		    	    for (int i = n - 1; i > 0; i--) {
		    	        int j = (int) (Math.random() * (i + 1));
		    	        Carta temp = cartas.get(i);
		    	        cartas.set(i, cartas.get(j));
		    	        cartas.set(j, temp);
		    	    }
		    }

		    public Carta darCarta() {
		        if (temCarta()) {
		            Carta carta = cartas.get(0);
		            cartas.remove(0);
		            return carta;
		        } else {
		            return null;
		        }
		    }

		    public boolean temCarta() {
		        return !cartas.isEmpty();
		    }

		    public void imprimeBaralho() {
		        for (Carta carta : cartas) {
		            System.out.println(carta.getNome() + " de " + carta.getNaipe());
		        }
		    }
		}
