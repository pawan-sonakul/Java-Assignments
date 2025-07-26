public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Pawan");
        Employee employee1 = new Employee(102, "Yash");

        System.out.println(employee);
        System.out.println(employee1);

    }
}

