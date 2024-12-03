public class personne{
    private String nom ;
    private String etat ;
    private int facteurTransmission;
    private float dResistance;
    private Placement placement;

    public personne(String nom, String etat, int facteurTransmission, float dResistance) {
        this.nom = nom;
        this.etat = etat;
        this.facteurTransmission = facteurTransmission;
        this.dResistance = dResistance;
        
    }
public String getNom() {
    return nom;
    }
public void setNom(String nom) {
    this.nom = nom;
    }
public String getEtat() {
    return etat;
    }
public void setEtat(String etat) {
    this.etat = etat;
    }
public int getFacteurTransmission() {
    return facteurTransmission;
    }
public void setFacteurTransmission(int facteurTransmission) {
    this.facteurTransmission = facteurTransmission;
    }
public float getdResistance() {
    return dResistance;
    }
public void setdResistance(float dResistance) {
    this.dResistance = dResistance;
    }
public void mourir(){

}
public double Deplacer(){
    
}
   }