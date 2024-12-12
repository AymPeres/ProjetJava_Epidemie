public class Maladie {
    
    private String nom;
    private float pIncubation ;
    private float tauxTransmissionInitial;
    private float distanceMaxTransmission ;
    private float pGuerison ;
    private float pDeces;

    public Maladie(String nom, float pIncubation, float tauxTransmissionInitial, float distanceMaxTransmission,
            float pGuerison, float pDeces) {
        this.nom = nom;
        this.pIncubation = pIncubation;
        this.tauxTransmissionInitial = tauxTransmissionInitial;
        this.distanceMaxTransmission = distanceMaxTransmission;
        this.pGuerison = pGuerison;
        this.pDeces = pDeces;
    }

    private void propager(){
        
    }
}
