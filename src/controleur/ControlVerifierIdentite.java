package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {

    private Village village;

    public ControlVerifierIdentite(Village village) {
        this.village = village;
    }

    public boolean verifierIdentite(String nomVillagois) {
        return village.trouverHabitant(nomVillagois) != null;
    }
}
