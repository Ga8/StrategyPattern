package Entity;

public class Stagiaire implements Role {


    @Override
    public String description() {
        return "Stagiaire Master 2 ";
    }

    @Override
    public String responsability() {
        return "search bugs";
    }
}
