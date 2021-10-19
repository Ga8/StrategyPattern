package Entity;

public class HumanResource implements Role{
    @Override
    public String description() {
        return "RH";
    }

    @Override
    public String responsability() {
        return "finding new salary";
    }
}
