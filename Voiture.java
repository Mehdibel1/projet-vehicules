public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String marque, String modele, int nombrePortes) {
        super(marque, modele);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        return super.toString() + " [Nombre de portes: " + nombrePortes + "]";
    }
}