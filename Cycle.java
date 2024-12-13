public class Cycle {
    private int dureeCycle;
    private int nbJour;


    public Cycle(int dureeCycle) {
        this.dureeCycle = dureeCycle;
        this.nbJour = 0; // Initialiser le nombre de jours à 0
    }


    public int getDureeCycle() {
        return dureeCycle;
    }


    public void setDureeCycle(int dureeCycle) {
        this.dureeCycle = dureeCycle;
    }


    public void miseJour() {
        // Incrémenter le nombre de jours du cycle
        nbJour++;


        // Vérifier si le cycle est terminé
        if (nbJour >= dureeCycle) {
            // Arrêter le cycle
            terminerCycle();
        } else {
            // Continuer le cycle
            demarrerJour();
        }
    }


    private void demarrerJour() {
        // Logique pour démarrer une nouvelle journée du cycle
    }


    private void terminerCycle() {
        // Logique pour terminer le cycle
    }
}
