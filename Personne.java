public class Personne {
    private EtatPersonne etat;
    private int facteurTransmission;
    private int dResistance;
    private Placement placement;
    private TypeComportement comportement;
    private Population population;
    private boolean vaccine;
    private TypePersonne typePersonne;
    private int compteurTypeComportement;

    
  

    public Personne( EtatPersonne etat, int facteurTransmission, int dResistance, Placement placement,
            TypeComportement comportement) {
        this.etat = etat;
        this.facteurTransmission = facteurTransmission;
        this.dResistance = dResistance;
        this.placement = placement;
        this.comportement = comportement;
        this.vaccine = false;
    }



    public Personne(EtatPersonne etat) {
        this.etat = etat;
    }



    public TypePersonne getTypePersonne() {
        return typePersonne;
    }



    public void setTypePersonne(TypePersonne typePersonne) {
        this.typePersonne = typePersonne;
    }



    public int getCompteurTypeComportement() {
        return compteurTypeComportement;
    }



    public void setCompteurTypeComportement(int compteurTypeComportement) {
        this.compteurTypeComportement = compteurTypeComportement;
    }



    public EtatPersonne getEtat() {
        return etat;
    }



    public void setEtat(EtatPersonne etat) {
        this.etat = etat;
    }



    public int getFacteurTransmission() {
        return facteurTransmission;
    }



    public void setFacteurTransmission(int facteurTransmission) {
        this.facteurTransmission = facteurTransmission;
    }



    public int getdResistance() {
        return dResistance;
    }



    public void setdResistance(int dResistance) {
        this.dResistance = dResistance;
    }



    public Placement getPlacement() {
        return placement;
    }



    public void setPlacement(int x, int y) {
        this.placement.setX(x);
        this.placement.setX(y);
    }



    public TypeComportement getComportement() {
        return comportement;
    }



    public void setComportement(TypeComportement comportement) {
        this.comportement = comportement;
    }



    public Population getPopulation() {
        return population;
    }



    public void setPopulation(Population population) {
        this.population = population;
    }



    public void mourir() {

    }

    public double deplacer() {

    }

    public double distanceEuclidienneP2(Personne p) {
        return placement.distance(p.placement);
    }

    public double PContagion(Personne p) {
        double distance = distanceEuclidienneP2(p);
        if(comportement==TypeComportement.AGRESSIF){
            distance=distance*2;
        }
        if (distance > population.getEpidemie().getMaladie().getDistanceMax()) {
            return 0;
        }
        return Math.max(0, population.getEpidemie().getMaladie().getTauxTransmissionInitial() * (1 - (distance / population.getEpidemie().getMaladie().getDistanceMax())));
    }

    public double PTransmissionFinale(Personne p){
        return PContagion(p)*facteurTransmission;
    }
}

