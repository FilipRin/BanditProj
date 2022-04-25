package banditi;

import java.util.ArrayList;
import java.util.List;



public class Kompozicija {
	
	private List<Vagon> vagoni;
	//public String smer;
	Smer smer;
	/*public static enum Smer{
		ISPRED,
		IZA
	}*/
	
	public Kompozicija(){
		//this.smer = null;
		this.vagoni=new ArrayList<>();
	}
	
	public void dodajVagon(Vagon v) {
		this.vagoni.add(v);
	}
	
	public Vagon dohvatiSusedniVagon(Vagon v,Smer s) throws GNepostojeciVagon {
		if(Smer.valueOf("ISPRED")==s) {
			//s.equals(Smer.ISPRED)
			this.smer=Smer.ISPRED;    //smer.ISPRED;
			if(this.vagoni.indexOf(v)-1>-1) {
				return this.vagoni.get(this.vagoni.indexOf(v)-1);
			}
			throw new GNepostojeciVagon();
		}
		else if(Smer.valueOf("IZA")==s) {
			//
			this.smer=Smer.IZA;
			if(this.vagoni.indexOf(v)+1 < vagoni.size()) {
				return this.vagoni.get(this.vagoni.indexOf(v)+1);
			}
			throw new GNepostojeciVagon();
			
		}
		
		throw new GNepostojeciVagon();
		
	}
	
	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
			for(int i=0;i<this.vagoni.size();i++) {
				if(vagoni.get(i).sadrziBandita(b)) {
					return this.vagoni.get(i);
				}	
			}
		throw new GNepostojeciVagon();
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<vagoni.size();i++) {
			if(i!=0) {
				sb.append('_');
				sb.append(vagoni.get(i));}
			else {
				sb.append(vagoni.get(i));
			}
		}
		return sb.toString();
	}
}
