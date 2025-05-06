package Adapter;

import Adaptee.WeighingMachine;

public class WeighingMachineAdapterImp implements WeighingMachineAdapter {

	WeighingMachine weight;
	
	public WeighingMachineAdapterImp(WeighingMachine weightObj){
		this.weight=weightObj;
	}
	
	@Override
	public double getWeightInKg() {
		double weightinPounds=weight.getWeightInPounds();
		double weightinKg=weightinPounds*.45;
		return weightinKg;
		
		
	}

}
