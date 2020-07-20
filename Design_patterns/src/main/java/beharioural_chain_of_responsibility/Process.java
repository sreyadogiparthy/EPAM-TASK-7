package beharioural_chain_of_responsibility;

public abstract class Process {
	public abstract void setNext(Process nextProcess);
	public abstract boolean process(int year);
}
