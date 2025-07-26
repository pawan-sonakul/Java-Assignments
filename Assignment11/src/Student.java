public class Student implements Cloneable {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }

    public static void main(String[] args) throws Exception{
        Student student = new Student(123, "Pawan");
        Student student1 = (Student)student.clone();

        System.out.println(student);
        System.out.println(student1);

    }

}
