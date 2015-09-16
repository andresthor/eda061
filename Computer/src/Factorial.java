import Datastruktur.*;
import Logik.*;

public class Factorial extends Program {
	
	public Factorial() {
		Address n = new Address(0),
		fac = new Address(1);
		add(new Copy(new LongWord(5), n));
		add(new Copy(new LongWord(1), fac));
		add(new JumpEq(6, n, new LongWord(1)));
		add(new Mul(fac, n, fac));
		add(new Add(n, new LongWord(-1), n));
		add(new Jump(2));
		add(new Print(fac));
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