package bunkov.les4;

public interface DBConnect<Employee extends Employeer> {
    void create(Employee employee);
    void delete(long id);
    void readInfo();
    void readInfo(long id);
}
