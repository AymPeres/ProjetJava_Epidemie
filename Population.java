import java.util.*;

public class Population {

    private List<Personne> individus;
    private Epidemie epidemie ;

    


    public Population(List<Personne> individus, Epidemie epidemie) {
        this.individus = individus;
        this.epidemie = epidemie;
    }

    public void ajouterIndividu(Personne individu) {
        this.individus.add(individu);
    }

    public List<Personne> obtenirIndividus() {
        return individus;
    }

    public EnumMap<EtatPersonne, Integer> obtenirStatistiques() {
        EnumMap<EtatPersonne, Integer> statistiques = new EnumMap<>(EtatPersonne.class);

        for (EtatPersonne etat : EtatPersonne.values()) {
            statistiques.put(etat, 0);
        }
        for (Personne individu : individus) {
            EtatPersonne etatActuel = individu.getEtat();
            statistiques.put(etatActuel, statistiques.get(etatActuel) + 1);
        }

        return statistiques;
    }

    public void mettreAJourPopulation() {
        for (Personne individu : individus) {
            individu.evaluerEtat();
        }
    }

    public List<Personne> getIndividus() {
        return individus;
    }

    public void setIndividus(List<Personne> individus) {
        this.individus = individus;
    }

    public Epidemie getEpidemie() {
        return epidemie;
    }

    public void setEpidemie(Epidemie epidemie) {
        this.epidemie = epidemie;
    }
}

