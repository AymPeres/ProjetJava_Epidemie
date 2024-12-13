public class Personne {
    private String nom;
    private EtatPersonne etat;
    private int facteurTransmission;
    private int dResistance;
    private Placement placement;
    private TypeComportement comportement;
    private Population population;

  

    public Personne(String nom, EtatPersonne etat, int facteurTransmission, int dResistance, Placement placement,
            TypeComportement comportement) {
        this.nom = nom;
        this.etat = etat;
        this.facteurTransmission = facteurTransmission;
        this.dResistance = dResistance;
        this.placement = placement;
        this.comportement = comportement;
    }



    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
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



    public void setPlacement(Placement placement) {
        this.placement = placement;
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

