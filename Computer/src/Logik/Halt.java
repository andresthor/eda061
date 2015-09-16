package Logik;

public class Halt implements Instruction{
	
	public Halt() {
		
	}
	
	public void execute() {
		Program.setCounter(-2);
	}

	public String string(){
		return "HLT";
	}
}
