public class Vehicule {
    private String marque;
    private String modele;
    private static int nombreVehicules = 0;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        nombreVehicules++;
    }

    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public static int getNombreVehicules() { return nombreVehicules; }

    @Override
    public String toString() {
        return "Véhicule: " + marque + " " + modele;
    }
}