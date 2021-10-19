package Entity;

public class SeniorDeveloper implements Role {
    @Override
    public String description() {
        return "Developer with 8 years experiences";
    }

    @Override
    public String responsability() {
        return "Developing and do software architecture";
    }
}
