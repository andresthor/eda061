package Logik;

import java.util.ArrayList;

public class Program extends ArrayList<Instruction> {

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
