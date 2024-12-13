public class Main {
    public static void Main(String[] args) {
        Population population1= new Population(100,10000,10000);
        population1.attribuer2Etats(20,EtatPersonne.INFECTE, EtatPersonne.SAIN);
        population1.attribuerTypesPersonnes(100,TypePersonne.NEUTRE);
        population1.attribuerComportements(100,TypeComportement.NORMALE,10);
        Epidemie epidemie = new Epidemie();


        Maladie maladie = new Maladie("COVID");
        Variant variant = new Variant("COVID19",0.4f,0.1f,10,0.5f,0.9f,1f,0.8f);
       // epidemie.lancerSimulation();
        System.out.println(epidemie.toString());
    }
}
