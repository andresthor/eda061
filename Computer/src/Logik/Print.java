package Logik;

import Datastruktur.Operand;
import Datastruktur.Memory;

public class Print implements Instruction{
	Operand in1;

	public Print(Operand in1) {
		this.in1 = in1;
	}
	
	public int execute(int lastInstruction, Memory memory) {
		System.out.println(in1.print(memory));
		return ++lastInstruction;
	}

	public String string(){
		return "PRT " + in1.string();
	}
}
