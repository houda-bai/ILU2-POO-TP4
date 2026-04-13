package produit;

public class Poisson extends Produit {

	private String date ;
	
	public Poisson(String date ) {
		super("poisson", unite.pièce);
		
		
	}
	
	public String decrireProduit() {
		StringBuilder message = new StringBuilder();
		message.append(getNom());
		message.append("peches");
		message.append(date);
		return(message.toString());
	}



}
