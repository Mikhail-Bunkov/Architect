package bunkov.les6;

public class Employee {

    private long id;

    private String name;

    private String vacancy;

    private int workingTime;

    public Employee(long id, String name, String vacancy, int workingTime) {
        this.id = id;
        this.name = name;
        this.vacancy = vacancy;
        this.workingTime = workingTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }
}
