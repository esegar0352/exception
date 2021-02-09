package human.student;

import java.util.Arrays;

public class Group {
    Student[] students = new Student[10];

    public Group() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentsGroup=" + Arrays.toString(students) +
                '}';
    }

    public void addStudent(Student student) throws MyStudentExeption {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            } else throw new MyStudentExeption();
        }
    }

    public String findStudent(String s) {
        for (Student student : students) {
            if (student != null && student.getName().equals(s)) {
                return student.gettingInfoAboutHuman();
            }
        }
        return "Студент не найден!";
    }

    public void deleteStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].equals(student)) {
                    students[i] = null;
                    System.out.println("Студент удален!");
                }
            }
        }
    }
}





