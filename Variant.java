public class Variant extends Maladie  {
    float tauxIncubation ;

    public Variant(String nom, float pIncubation, float tauxTransmissionInitial, float distanceMaxTransmission,
            float pGuerison, float pDeces, float tauxIncubation) {
        super(nom, pIncubation, tauxTransmissionInitial, distanceMaxTransmission, pGuerison, pDeces);
        this.tauxIncubation = tauxIncubation;
    }

    
    
}
