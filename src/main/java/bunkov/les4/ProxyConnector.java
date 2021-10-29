package bunkov.les4;

public class ProxyConnector <Employee extends Employeer> implements DBConnect<Employee>{
    private DBConnect<Employee> connect;

    public ProxyConnector(DBConnect<Employee> connect) {
        this.connect = connect;
    }


    @Override
    public void create(Employee employee) {
        connect.create(employee);
        System.out.println("log: created employee");
    }

    @Override
    public void delete(long id) {
        connect.delete(id);
        System.out.println("log: employee deleted");
    }

    @Override
    public void readInfo() {
        connect.readInfo();
        System.out.println("log: got info about all employees");
    }

    @Override
    public void readInfo(long id) {
        connect.readInfo(id);
        System.out.println("log: got info about employee with id = "+id);
    }
}
