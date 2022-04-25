# BanditProj

• *Bandit* se stvara sa zadatim timom kom pripada (A, B) i sadrži celobrojnu količinu
zlatnika (pri stvaranju 50). Tim i količina zlatnika mogu da se dohvate. Moguće je
promeniti količinu zlatnika za zadatu količinu. Tekstualni opis bandita se sastoji iz
oznake tima i količine zlatnika (npr. A50).

--------------------------
• *Vagon* sadrži proizvoljan broj bandita. Pri stvaranju, vagon je prazan. Moguće je dodati
bandita u vagon. Moguće je ispitati da li se u vagonu nalazi zadati bandit. Moguće je
ukloniti zadatog bandita iz vagona. Moguće je dohvatiti broj bandita u vagonu. Moguće je
dohvatiti bandita sa zadate pozicije u vagonu. Tekstualni opis vagona sadrži opise svih
bandita odvojene zarezima, unutar para uglastih zagrada.

--------------------------
• *Kompozicija* vagona sadrži proizvoljan broj vagona. Pri stvaranju, kompozicija je prazna.
Moguće je dodati zadati vagon na kraj kompozicije. Moguće je dohvatiti vagon u kom se
nalazi zadati bandit. Greška (GNepostojeciVagon) je ukoliko vagon ne postoji. Moguće
je dohvatiti susedni vagon zadatog vagona u zadatom smeru (ISPRED, IZA). Greška
(GNepostojeciVagon) je ukoliko vagon ne postoji. Tekstualni opis kompozicije sadrži
opise svih vagona odvojene donjim crtama.

---------------------------
• *Akcija* se stvara sa zadatom kompozicijom i može da se izvrši nad zadatim banditom.

---------------------------
• *Pomeranje* je akcija koja se stvara sa zadatim smerom. Pomeranjem, bandit se uklanja iz
vagona u kom se trenutno nalazi i dodaje u susedni vagon kompozicije u smeru pomeranja.
Ukoliko se bandit ne nalazi ni u jednom vagonu kompozicije ili susedni vagon ne postoji,
operacija je bez efekta. Tekstualni opis pomeranja je oblika Pomeranje: smer.

---------------------------
Priložena je klasa sa glavnom funkcijom koja ispituje osnovne funkcionalnosti paketa klasa uz
ispisivanje rezultata na standardnom izlazu (konzoli).
