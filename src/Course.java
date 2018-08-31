public class Course {
    private String name;
    private String[] students = new String[20];
    private int studentsCount;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void addStudent(String name) {
        students[studentsCount] = name;
        studentsCount++;
    }

    public void removeStudent(String name) {
        boolean check = true;
        for (int i = 0; i < studentsCount; i++) {
            if (students[i].equals(name)) {
                check = true;
                for (int j = i + 1; j < studentsCount; j++) {
                    students[j - 1] = students[j];
                }
                studentsCount--;
                System.out.println("Student "+ name);
            }
            if (check == false) {
                System.out.println("NOT FOUND");
            }
        }
    }
}
