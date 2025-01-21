public class Moto extends Vehicule {
    private String typeGuidon;

    public Moto(String marque, String modele, String typeGuidon) {
        super(marque, modele);
        this.typeGuidon = typeGuidon;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type de guidon: " + typeGuidon + "]";
    }
}