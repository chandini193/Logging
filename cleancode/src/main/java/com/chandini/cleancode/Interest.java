package com.chandini.cleancode;

public class Interest {
	public double simpleInterest(double p , double r, double t){
		return (p*t*r)/100.0;
	}
	public double compoundInterest(double p , double r, double t){
		return p* (Math.pow( (1+(r/100)) , t) - 1);
	}
}
