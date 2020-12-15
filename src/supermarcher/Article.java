package supermarcher;

public class Article {

	private String nom;
	private double prix;
	private boolean solde;

	public Article(String nom, double prix, boolean solde) {

		this.nom = nom;
		this.prix = prix;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isSolde() {
		return solde;
	}

	public void setSolde(boolean solde) {
		this.solde = solde;
	}

	public void afficher() {
		System.out.println("Nom de l'aritcle  : " + nom);
		System.out.println("Prix d'article : " + prix);

		if (solde = true)
			System.out.println("(en solde)");
		else
			System.out.println("(non solde)");
	}
}
