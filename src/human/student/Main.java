package human.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Andrey", "Osipov", 25, 13, 2, "Computer", "Ingener");
        Student student1 = new Student("Sergey", "Staroschuk", 22, 12, 2, "Computer", "QA");
        Student student2 = new Student("Ivan", "Ivanov", 22, 11, 2, "Computer", "Devoloper");
        Student student3 = new Student("Evgeniy", "Petrov", 18, 10, 2, "Computer", "Ingener");
        Student student4 = new Student("Oleg", "Sidorov", 24, 9, 2, "Computer", "Designer");
        Student student5 = new Student("Aleksey", "Moskov", 23, 8, 2, "Computer", "PM");
        Student student6 = new Student("Mikhail", "Dovlov", 22, 7, 2, "Computer", "Devoloper");
        Student student7 = new Student("Anatoliy", "Tarasov", 21, 6, 2, "Computer", "Designer");
        Student student8 = new Student("Illya", "Kravcov", 20, 5, 2, "Computer", "Designer");
        Student student9 = new Student("Nikolay", "Permyakov", 19, 4, 2, "Computer", "Devoloper");
        Student student10 = new Student("Vasiliy", "Libkind", 18, 3, 2, "Computer", "Ingener");
        Student student11 = new Student("Anton", "Staroschuk", 17, 2, 2, "Computer", "QA");
        Group group = new Group();


        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);

        group.deleteStudent(student3);
        System.out.println(group.toString());

        System.out.println(group.findStudent("Sidorov"));
    }
}