package com.chandini.cleancode;

public class HouseConstructionCost {
	int materialCost[] = {1200, 1500, 1800, 2500};
	public int caluclateCost(int standard,int area){
		return area * materialCost[standard-1];
	}
}
