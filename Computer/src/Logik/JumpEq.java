package Logik;

import Datastruktur.Operand;

public class JumpEq extends Jump{
	Operand in1, in2;

	public JumpEq(int instruction, Operand in1, Operand in2) {
	super(instruction);	
	this.in1 = in1;
	this.in2 = in2;
	}

	public void execute() {
		
	}

	public String string(){
	return "JEQ " + super.instruction + " " + in1.string() + " " + in2.string();
	}
}
