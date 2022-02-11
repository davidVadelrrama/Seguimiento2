package model;

import exception.NegattiveNumberException;


public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegattiveNumberException{
		if(additionalW < 0) {
			throw new NegattiveNumberException();
		}else {
			weight = weight + additionalW;
		}
		
	}
	
	public void removeWeight(double w) throws NegattiveNumberException {
		if(w < 0) {
			throw new NegattiveNumberException();
		}else {
			weight = weight - w;
		}
	}
	
}
