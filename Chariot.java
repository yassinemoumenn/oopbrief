package supermarcher;

import java.util.HashMap;

public class Chariot {
	public HashMap<Article, Integer> articles1 = new HashMap<>();
	
    public void remplir (Article article, int quantite){
        // Add keys and values (ARTICLE, QUANTITE)
        articles1.put(article, quantite);
        
    }
}
