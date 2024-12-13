import java.util.EnumMap;

public class Variant extends Maladie  {
    float tauxIncubation ;

    public Variant(String nom, int pIncubation, float tauxTransmissionInitial, float distanceMaxTransmission,
            float pGuerison, float pDeces, float distanceMax, EnumMap<TypePersonne, Float> listeFacteursTransmission,
            float tauxIncubation) {
        super(nom, pIncubation, tauxTransmissionInitial, distanceMaxTransmission, pGuerison, pDeces, distanceMax,
                listeFacteursTransmission);
        this.tauxIncubation = tauxIncubation;
    }

   
    
    
}
