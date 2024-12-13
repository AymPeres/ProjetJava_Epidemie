import java.util.EnumMap;
import java.util.HashMap;

public class Variant {
    
    private String nom;
    private int pIncubation ;
    private float tauxTransmissionInitial;
    private int distanceMaxTransmission ;
    private float pGuerison ;
    private float pDeces;
    private EnumMap<TypePersonne,Float> listeFacteursTransmission;
    private float tauxIncubation ;

 

    public Variant(String nom, int pIncubation, float tauxTransmissionInitial, float distanceMaxTransmission,
            float pGuerison, float pDeces, float distanceMax, float pneutre , float psensible , float presistante) {
        this.nom = nom;
        this.pIncubation = pIncubation;
        this.tauxTransmissionInitial = tauxTransmissionInitial;
        this.distanceMaxTransmission = distanceMaxTransmission;
        this.pGuerison = pGuerison;
        this.pDeces = pDeces;
        this.distanceMax = distanceMax;
        this.listeFacteursTransmission = new EnumMap<>(TypePersonne.class);
        if(pneutre<0 || pneutre>1 || psensible<0 || psensible>1 || presistante<0 || presistante>1){
            throw new IllegalArgumentException("Les probabilités nombre doivent être entre 0 et 1.");
        }
        listeFacteursTransmission.put(TypePersonne.SENSIBLE, psensible);
        listeFacteursTransmission.put(TypePersonne.NEUTRE , pneutre);
        listeFacteursTransmission.put(TypePersonne.RESISTANTE, presistante);


    }



    public Variant(String nom, float pGuerison,  float pDeces,   int distanceMaxTransmission, float tauxTransmissionInitial, float pneutre , float psensible , float presistante) {
        this.nom = nom;
        this.tauxTransmissionInitial = tauxTransmissionInitial;
        this.distanceMaxTransmission = distanceMaxTransmission;
        this.pGuerison = pGuerison;
        this.pDeces = pDeces;
        this.listeFacteursTransmission = new EnumMap<>(TypePersonne.class);
        if(pneutre<0 || pneutre>1 || psensible<0 || psensible>1 || presistante<0 || presistante>1){
            throw new IllegalArgumentException("Les probabilités nombre doivent être entre 0 et 1.");
        }
        listeFacteursTransmission.put(TypePersonne.SENSIBLE, psensible);
        listeFacteursTransmission.put(TypePersonne.NEUTRE , pneutre);
        listeFacteursTransmission.put(TypePersonne.RESISTANTE, presistante);
    }



    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public int getpIncubation() {
        return pIncubation;
    }



    public void setpIncubation(int pIncubation) {
        this.pIncubation = pIncubation;
    }



    public float getTauxTransmissionInitial() {
        return tauxTransmissionInitial;
    }



    public void setTauxTransmissionInitial(float tauxTransmissionInitial) {
        this.tauxTransmissionInitial = tauxTransmissionInitial;
    }



    public float getDistanceMaxTransmission() {
        return distanceMaxTransmission;
    }



    public void setDistanceMaxTransmission(float distanceMaxTransmission) {
        this.distanceMaxTransmission = distanceMaxTransmission;
    }



    public float getpGuerison() {
        return pGuerison;
    }



    public void setpGuerison(float pGuerison) {
        this.pGuerison = pGuerison;
    }



    public float getpDeces() {
        return pDeces;
    }



    public void setpDeces(float pDeces) {
        this.pDeces = pDeces;
    }



    public float getDistanceMax() {
        return distanceMax;
    }



    public void setDistanceMax(float distanceMax) {
        this.distanceMax = distanceMax;
    }



    private void propager(){
        
    }
}
