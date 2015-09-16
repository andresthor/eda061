package Datastruktur;


public class LongWord implements Word{
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	public long value() {
		return value;
	}
	
	public String string() {
		return Long.toString(value);
	}
}
