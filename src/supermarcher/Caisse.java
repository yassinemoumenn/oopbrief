package supermarcher;

public class Caisse {
	private int numCaisse;
	private double montant;

	public Caisse(int numDeCaisse, double montant) {
		this.numCaisse = numCaisse;
		this.montant = montant;
	}

	public void scanner(Chariot chariot) {
		System.out.println("###############  " + chariot + " Facture" + "  ###############");

		for (Article i : chariot.articles1.keySet()) {

			double produit = i.getPrix() * chariot.articles1.get(i);
	
}}}