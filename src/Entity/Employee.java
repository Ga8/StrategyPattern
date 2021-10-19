package Entity;


public class Employee {

    private String name ;
    private Role role ;

    public Employee(String name, Role role) {
        this.name = name;
        if (role == null ) {
        role = new Stagiaire();
        }
        this.role = role;
    }

    public void promote (Role newRole ){
        role = newRole;
    }

    public void doWork() {
        System.out.println( name + " will " + role.responsability());
    }
}
