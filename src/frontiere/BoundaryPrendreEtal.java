package frontiere;

import controleur.ControlPrendreEtal;
import controleur.ControlVerifierIdentite;

public class BoundaryPrendreEtal {

    private ControlPrendreEtal controlPrendreEtal;

    public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
        this.controlPrendreEtal = controlChercherEtal;
    }

    public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnu) {
			System.out.println("Je suis désolée " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.");
		}
		else {
			installerVendeur(nomVendeur);
		}
    }

    private void installerVendeur(String nomVendeur) {
    	System.out.println("Bonjour " + nomVendeur + " ,je vais regarder si je peux vous trouver un etal");
		boolean etalDisponible = controlPrendreEtal.resteEtals();
		if (!etalDisponible) {
			System.out.println("Désolée " + nomVendeur + " je n'ai plus d'etal qui ne soit pas deja occupé.");
		}
		else {
			System.out.println("C'est parfait, il me reste un etal pour vous !");
			System.out.println("Il me faudrait quelques renseignement :");
			String produit = Clavier.entrerChaine("Quel produit souhaitez-vous vendre ?");
			int nbProduit = Clavier.entrerEntier("Combien souhaitez-vous vendre ?");
			int numeroEtal =  controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
			if (numeroEtal != 0) {
				System.out.println("Le vendeur " + nomVendeur + " s'est installé a l'etal n°" + numeroEtal + ".");
			}
		}
    }
}
