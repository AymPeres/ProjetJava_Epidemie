import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Population {

    // Liste des individus de la population
    private List<Personne> individus;

    // Constructeur par défaut
    public Population() {
        this.individus = new ArrayList<>();
    }

    // Ajouter un individu à la population
    public void ajouterIndividu(Personne individu) {
        this.individus.add(individu);
    }

    // Obtenir la liste des individus
    public List<Personne> obtenirIndividus() {
        return individus;
    }

    // Obtenir les statistiques de la population par état de santé
    public Map<EtatPersonne, Integer> obtenirStatistiques() {
        Map<EtatPersonne, Integer> statistiques = new HashMap<>();

        // Initialisation des compteurs
        for (EtatPersonne etat : EtatPersonne.values()) {
            statistiques.put(etat, 0);
        }

        // Comptage des individus par état de santé
        for (Personne individu : individus) {
            EtatPopulation etatActuel = individu.getEtat();
            statistiques.put(etatActuel, statistiques.get(etatActuel) + 1);
        }

        return statistiques;
    }

    // Mettre à jour l'état de chaque individu dans la population
    public void mettreAJourPopulation() {
        for (Personne individu : individus) {
            individu.evaluerEtat();
        }
    }
}
