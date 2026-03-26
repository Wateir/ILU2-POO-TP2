package frontiere;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		boolean acheteurReconnu = controlAcheterProduit.isAcheteur(nomAcheteur);
		if (!acheteurReconnu) {
			System.out.println("Je suis désolée " + nomAcheteur +" mais il faut être un habitant de notre village pour commercer ici.");
		}
		else {
			Gaulois[] vendeurs = controlAcheterProduit.vendeurProduit(produit);
			if (vendeurs != null) {
				System.out.println("Désolé, personne ne vend ce produit au marché.");
			}
			else {
				System.out.println("Chez quel commerçant voulez-vous acheter des fleurs ?");
				for (int i =0; i < vendeurs.length; i++) {
					
				}
			}
		}
	}
}
