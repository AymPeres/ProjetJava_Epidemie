public class Personne {
    private String nom;
    private String etat;
    private int facteurTransmission;
    private float dResistance;
    private Placement placement;

    public Personne(String nom, String etat, int facteurTransmission, float dResistance) {
        this.nom = nom;
        this.etat = etat;
        this.facteurTransmission = facteurTransmission;
        this.dResistance = dResistance;
    }

    public getEtat(){
        retuen etat;
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
        if (distance > distanceMax) {
            return 0;
        }
        return Math.max(0, tauxTransmissionInitial * (1 - (distance / distanceMax)));
    }
}
