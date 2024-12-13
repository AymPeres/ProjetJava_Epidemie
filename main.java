public class main {
    public static void main(String[] args) {
        //Virus virus = new Virus(0.5, 0.4, 0.1, 2, 10);
        Epidemie simulation = new Epidemie(100, virus, 10);
        simulation.lancerSimulation();
    }
}
