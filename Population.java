import java.util.*;

public class Population {

    private Personne[] individus;
    private int nbPersonnes;
    private Epidemie epidemie;


    public Population(int nbPersonnes, int longueur, int largeur) {
        individus = new Personne[nbPersonnes];
        Random random = new Random();

        for (int i = 0; i < nbPersonnes; i++) {
            individus[i] = new Personne(EtatPersonne.SAIN);
            individus[i].setPlacement(random.nextInt(largeur),random.nextInt(longueur));
        }

    }

    public void ajouterIndividu(Personne individu) {
        this.individus[individus.length+1] = individu;
    }

    public void attribuer2Etats(int pourcentage,EtatPersonne etat1,EtatPersonne etat2){
        for(int i = 0; i < ((nbPersonnes*pourcentage)/100); i++){
            individus[i].setEtat(etat1);
        }
        for(int i =((nbPersonnes*pourcentage)/100); i < nbPersonnes; i++){
            individus[i].setEtat(etat2);
        }
    }

    public void attribuerTypesPersonnes(int pourcentage,TypePersonne type){
        for(int i = 0; i < ((nbPersonnes*pourcentage)/100); i++){
            individus[i].setTypePersonne(type);
        }
    }

    public void attribuerComportements(int pourcentage, TypeComportement type,int n){
        for(int i = 0; i < ((nbPersonnes*pourcentage)/100); i++){
            individus[i].setComportement(type);
            individus[i].setCompteurTypeComportement(n);

        }
    }

    public Personne[] obtenirIndividus() {
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
       
    }

    public Personne[] getIndividus() {
        return individus;
    }

    public void setIndividus(Personne[] individus) {
        this.individus = individus;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public Epidemie getEpidemie() {
        return epidemie;
    }

    public void setEpidemie(Epidemie epidemie) {
        this.epidemie = epidemie;
    }


}

