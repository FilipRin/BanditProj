package banditi;

public abstract class Akcija {

	protected Smer sm; 
	protected Kompozicija kom;
	
	public Akcija(Kompozicija k) {
		
		this.kom=k;
	}
	public Akcija(Kompozicija k,Smer s) {
		
		this.kom=k;
		this.sm=s;
	}

	public abstract void izvrsi(Bandit b) throws GNepostojeciVagon;
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Pomeranje: ");
		sb.append(this.sm);
		return sb.toString();
	}
}
