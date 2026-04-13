package produit;

public abstract class Produit {
	private String nom ;
	private int unite; 
	
	enum unite {
		gramme,kilogramme, litre, centilitre, millilitre ,pièce 
	}
	
	protected Produit(String nom, int unite) {
		this.unite=unite ;
		this.nom=nom;
	}
	public String getNom() {
		return nom; 
	}
	
	public abstract String decrireProduit();
}
