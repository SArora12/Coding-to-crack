package Client;

import Adaptee.WeighingMachineImp;
import Adapter.WeighingMachineAdapterImp;
import Adapter.WeighingMachineAdapter;

public class Main {
	public static void main(String args[]) {
		WeighingMachineAdapter weight=new WeighingMachineAdapterImp(new WeighingMachineImp());
		System.out.println(weight.getWeightInKg());
	}
}
