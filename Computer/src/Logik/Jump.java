package Logik;

public class Jump implements Instruction{
	protected int instruction;
	
	public Jump(int instruction) {
		this.instruction = instruction;
	}
	
	public void execute() {
		
	}

	public String string(){
		return "JMP " + instruction;
	}
}
