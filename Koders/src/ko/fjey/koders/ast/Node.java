package ko.fjey.koders.ast;

public abstract class Node implements Dumpable{
	
	abstract public Location location();
	
	public void dump() {
		dump(System.out);
	}
	
	public void dump(PrintStream s) {
		dump(new Dumper(s));
	}
	
	public void dump(Dumper d) {
		d.printClass(this, location);
	}
	
	abstract protected void _dump(Dumper d);
}
