import Logik.*;
import Datastruktur.*;

public class TestProgram extends Program {
	
	public TestProgram() {
		Address n = new Address(0);
		//fac = new Address(1);
		add(new Add(new LongWord(1), n, n));
		add(new Print(n));
		add(new Jump(0));
		//add(new Print(fac));	
		add(new Halt());				
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