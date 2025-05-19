import java.util.ArrayList;

class Favalier extends Piece {

    public Favalier() {
        super('B', new Position());
    }

    public Favalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType(){
    	return new String("favalier");
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> liste = new ArrayList<Position>();

        // Déplacements de type Fou
        Fou Ouf = new Fou(this.getCouleur(), this.getPosition());
        liste.addAll(Ouf.getDeplacementPossible(pl));

        // Déplacements de type Cavalier
        Cavalier Cave = new Cavalier(this.getCouleur(), this.getPosition());
        ArrayList<Position> cav = Cave.getDeplacementPossible(pl);
        for (Position p : cav) {
            if (!liste.contains(p)) {
                liste.add(p);
            }
        }

        return liste;
    }
}
