import java.util.ArrayList;

public class Maladie {

    private String nom;
    private ArrayList<Variant> variants;

    public Maladie(String nom) {
        this.nom = nom;
        this.variants= new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Variant> getVariants() {
        return variants;
    }

    public void addVariant(Variant variant) {
        this.variants.add(variant);
    }

    
}
