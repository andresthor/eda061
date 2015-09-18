package Logik;

import java.util.ArrayList;

public class Program extends ArrayList<Instruction> {
	// Skulle kunna skriva int execute() och låta in styra prgcounter
	private static int prgCounter;
	
	public void run() {
		prgCounter = 0;
		while (prgCounter > -1) {
			this.get(prgCounter).execute();
			prgCounter++;
		}
	}

	static void setCounter(int prgCount) {
		prgCounter = prgCount;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		int i = 0;

		for (Instruction inst : this) {
		str.append(i + " " + inst.string() + "\n");
		i++;
		}
		
		return str.toString();
	}
}
