package human.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group implements Voenkom {
    private Student[] students = new Student[10];
    private int studentsAmount = 0;

    public Group() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentsGroup=" + Arrays.toString(students) +
                '}';
    }

    public void addStudent(Student student) {
        if (studentsAmount >= 10) {
            throw new MyStudentException();
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                studentsAmount++;
                break;
            }
        }
    }

    public void addStudent() {
        int freePlace = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                freePlace = i;
                System.out.println("Free place was found in group. Please enter student data ");
                break;
            }
        }
        if (freePlace < 0) {
            System.out.println("The group is full");
        } else {
            while (true) {
                Student st = new Student();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Please enter student surname (String):");
                    st.setSurname(reader.readLine());
                    System.out.println("Please enter student name (String):");
                    st.setName(reader.readLine());
                    System.out.println("Please enter student age (int 1-100):");
                    st.setAge(Integer.parseInt(reader.readLine()));
                    System.out.println("Please enter student course (int 1-6):");
                    st.setId(Integer.parseInt(reader.readLine()));
                    System.out.println("Please enter student ID (int 1-6):");
                    st.setCourse(Integer.parseInt(reader.readLine()));
                    System.out.println("Please enter student faculty (String):");
                    st.setFaculty(reader.readLine());
                    System.out.println("Please enter student faculty (String):");
                    st.setFaculty(reader.readLine());
                    students[freePlace] = st;
                    System.out.println("Student " + st.getSurname() + " is added to the group");
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid enter, student is not added, try again? (y / n):");
                    try {
                        if (reader.readLine().equals("y")) {
                            System.out.println("Please enter student data:");
                        } else {
                            break;
                        }
                    } catch (Exception x) {
                        System.out.println("Invalid enter");
                        break;
                    }
                }
            }
        }
    }


    public String findStudent(String searchSurname) {
        for (Student student : students) {
            if (student != null && student.getSurname().equals(searchSurname)) {
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
                    studentsAmount--;
                    System.out.println("Студент удален!");
                }
            }
        }
    }


    @Override
    public void getStudentValidForArmy() {
        Student[] studentValidForArmy = new Student[students.length];
        int counterOfValidStudent = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getAge() >= 18) {
                studentValidForArmy[counterOfValidStudent] = students[i];
                counterOfValidStudent++;
            }
        }  System.out.println(counterOfValidStudent);

    }

    }






