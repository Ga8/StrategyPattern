package Entity;

public class Developer implements Role{

    @Override
    public String description() {
        return "Software engineer developing web application";
    }

    @Override
    public String responsability() {
        return "Develop application";
    }
}
