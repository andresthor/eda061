package Logik;

import Datastruktur.Operand;

public class Print implements Instruction{
	Operand in1;

	public Print(Operand in1) {
		this.in1 = in1;
	}
	
	public void execute() {
		System.out.println(in1.value());
	}

	public String string(){
		return "PRT " + in1.string();
	}
}
