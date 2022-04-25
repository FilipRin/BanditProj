package banditi;

public class Bandit {

	private int vrednostZl;
	private Tim tim;
	
	public static enum Tim{
		A,
		B
	};
	
	public Bandit( Tim T ){
		this.tim = T;
		this.vrednostZl = 50;
	}
	
	public Tim dohvatiTim() { return this.tim; }
	
	public int dohvatiBrojZlatnika() {return this.vrednostZl;}
	
	public void promeniBrojZlatnika(int kolicina) {
		this.vrednostZl+=kolicina;
	} 
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(this.tim);
		sb.append(this.vrednostZl);
		return sb.toString();
	}
}
