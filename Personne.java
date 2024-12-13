public class Personne {
    private String nom;
    private EtatPersonne etat;
    private int facteurTransmission;
    private float dResistance;
    private Placement placement;
    private TypeComportement comportement;




    public Personne(String nom, EtatPersonne etat, int facteurTransmission, float dResistance) {
        this.nom = nom;
        this.etat = etat;
        this.facteurTransmission = facteurTransmission;
        this.dResistance = dResistance;
    }


    public getEtat(){
        return etat;
    }




    public void mourir() {


    }


    public double deplacer() {


    }


    public double distanceEuclidienneP2(Personne p) {
        return placement.distance(p.placement);
    }


    public double PContagion(Personne autre, double tauxTransmissionInitial, double distanceMax) {
        double distance = distanceEuclidienneP2(autre);
        if(comportement==TypeComportement.AGRESSIF){
            distance=distance*2;
        }
        if (distance > distanceMax) {
            return 0;
        }
        return Math.max(0, tauxTransmissionInitial * (1 - (distance / distanceMax)));
    }
}

