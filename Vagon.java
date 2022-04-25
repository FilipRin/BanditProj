package banditi;

import java.util.ArrayList;
import java.util.List;

public class Vagon {

	private List<Bandit> lista;
	
	
	public Vagon(){
		this.lista=new ArrayList<>();
	}
	
	public void dodajBandita(Bandit b) {
		lista.add(b);
	}
	
	public Bandit dohvatiBandita(int poz)  {
		return this.lista.get(poz);
	}
	
	public boolean sadrziBandita(Bandit b)  {
		return this.lista.contains(b);
	}
	
	public void ukloniBandita(Bandit b) {
		this.lista.remove(b);
	}
	
	public int dohvatiBrojBandita() {
		return this.lista.size();
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append('[');
		for(int i=0;i<lista.size();i++) {
			if(i!=0) {
				sb.append(',');
				sb.append(lista.get(i));
			}
			else {sb.append(lista.get(i));}
		}
		sb.append(']');
		return sb.toString();
	}
}
