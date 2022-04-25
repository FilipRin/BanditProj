package banditi;

public class Pomeranje extends Akcija {

	public Pomeranje(Kompozicija K ,Smer sm) {
		super(K,sm);
		
	}

	@Override
	public void izvrsi(Bandit b) throws GNepostojeciVagon {
		Vagon vpom;
		Vagon vpom2;
		//=new Vagon()
		try{vpom=kom.dohvatiVagon(b);}
		catch(GNepostojeciVagon e) {
			vpom=null;
		}
		try {
			vpom2=kom.dohvatiSusedniVagon(vpom, sm);
		} catch (GNepostojeciVagon e) {
			vpom2=null;
		}
		if(vpom==null || vpom2 == null) {
			//throw new GNepostojeciVagon();
			return;
		}
		else {
			vpom.ukloniBandita(b);
			vpom=kom.dohvatiSusedniVagon(vpom, sm);
			vpom.dodajBandita(b);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
