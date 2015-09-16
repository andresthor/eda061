package Logik;

import java.util.ArrayList;

public class Program extends ArrayList<Instruction> {
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


}
