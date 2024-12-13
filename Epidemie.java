import java.util.*;

public class Epidemie {
    private Population population;
    private Variant maladie;
    private ArrayList<Cycle> cycles ;
    

  
    public Epidemie(Population population, Variant maladie, ArrayList<Cycle> cycles) {
        this.population = population;
        this.maladie = maladie;
        this.cycles = cycles;
    }

    public Epidemie() {
    }

    public Population getPopulation() {
        return population;
    }

    public void setPopulation(Population population) {
        this.population = population;
    }

    public Variant getMaladie() {
        return maladie;
    }

    public void setMaladie(Variant maladie) {
        this.maladie = maladie;
    }

    public void ajouterCycle (Cycle cycle){
        cycles.add(cycle);

    }
  /*   public void lancerSimulation() {
        for (int cycle = 1; cycle <= cycles; cycle++) {
            System.out.println("Cycle " + cycle);
            miseAJourEtats();
            affichageStatistiques();
        }

    
    }
*/

 /*    

   
     private void miseAJourEtats() {
        Random random = new Random();
        for (Individu individu : population) {
            if (individu.etat == Etat.INCUBATION) {
                individu.cyclesResistant++;
                if (individu.cyclesResistant >= virus.periodeIncubation) {
                    individu.etat = Etat.CONTAGIEUX;
                }
            } else if (individu.etat == Etat.CONTAGIEUX) {
                for (Individu autre : population) {
                    if (autre.etat == Etat.SAIN && individu.distance(autre) <= virus.dMax) {
                        double prob = virus.probabiliteTransmission(individu.distance(autre));
                        if (random.nextDouble() < prob) {
                            autre.etat = Etat.INCUBATION;
                        }
                    }
                }
                if (random.nextDouble() < virus.probDeces) {
                    individu.etat = Etat.DECEDE;
                } else if (random.nextDouble() < virus.probGuerison) {
                    individu.etat = Etat.GUERI;
                    individu.cyclesResistant = 0;
                }
            } else if (individu.etat == Etat.GUERI) {
                individu.cyclesResistant++;
                if (individu.cyclesResistant > 5) {
                    individu.etat = Etat.SAIN;
                }
            }
        }
    }*/
    public void afficher_historique(){
        
    }
}
