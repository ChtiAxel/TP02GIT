import java.util.ArrayList;

public class Tavalier extends Piece {

    public Tavalier() {
        super('B', new Position());
    }

    public Tavalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType() {
        return new String("tavalier");
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> liste = new ArrayList<>();

        // Mouvements de la Tour
        Tour tempTour = new Tour(this.getCouleur(), this.getPosition());
        liste.addAll(tempTour.getDeplacementPossible(pl));

        // Mouvements du Cavalier
        Cavalier tempCavalier = new Cavalier(this.getCouleur(), this.getPosition());
        liste.addAll(tempCavalier.getDeplacementPossible(pl));

        return liste;
    }
}
