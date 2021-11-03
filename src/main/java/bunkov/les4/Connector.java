package bunkov.les4;

public class Connector<Employee extends Employeer> implements DBConnect<Employee>{

    //jdbc field

    @Override
    public void create(Employee employee) {
        //creating employee in db
        System.out.println("employee created "+employee.getId()+" - "+employee.getName());
    }

    @Override
    public void delete(long id) {
        //deleting employee from db
        System.out.println("employee with id = "+id +" deleted");
    }

    @Override
    public void readInfo() {
        //read info from db
        System.out.println("List of employees");
    }

    @Override
    public void readInfo(long id) {
        //read info from db about employee with id
        System.out.println("Info about employee with id = "+id);
    }
}
