package bunkov.les6;

import java.util.HashMap;
import java.util.Map;

public class EmployeeIdentityMap {
    private static Map<Long, Employee> employeeMap = new HashMap<>();

    public static void addEmployee(Employee employee){
        employeeMap.put(employee.getId(), employee);
    }
    public static Employee getEmployee(long id){
        return employeeMap.get(id);
    }
}
