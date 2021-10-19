import Entity.Developer;
import Entity.Employee;
import Entity.SeniorDeveloper;

public class Main {

    public static void main(String[] args) {

        Employee marcel = new Employee("Marcel", new Developer());

        marcel.doWork();

        marcel.promote(new SeniorDeveloper());
        marcel.doWork();

        Employee jeremy = new Employee("Jeremy", null);
        jeremy.doWork();
    }
}
