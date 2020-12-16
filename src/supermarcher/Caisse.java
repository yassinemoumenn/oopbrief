package supermarcher;

public class Caisse {

    //Variables
    private int numDeCaisse;
    private double montant;


//Constructors
    public Caisse(int numDeCaisse, double montant) {
        this.numDeCaisse = numDeCaisse;
        this.montant = montant;
    }



//Method scanner
    public void scanner(Chariot chariot){
        System.out.println("  " + chariot + " Facture" + "  ");

        for (Article i : chariot.articles1.keySet()) {
//            chariot.remplir(i, chariot.articlesList.get(i));

            double produit = i.getPrix() * chariot.articles1.get(i);
            System.out.println( i.getNom() + ": " + i.getPrix() + " * " + chariot.articles1.get(i) + " = " + produit + "MAD " + i.afficher());
            montant = montant+produit;

        }

    }

//Method montantTotal
    public void montantTotal(){
        System.out.println("lontent");
        System.out.println("Le Montant de cet Caisse est : " + montant);
        System.out.println("ddddddddddd");

    }
}