package Entity;


public class Employee {

    private String name ;
    private Role role ;


    public void promote (Role newRole ){
        role = newRole;
    }

    public void doWork() {
        System.out.println( name + "will " + role.description());
    }
}
