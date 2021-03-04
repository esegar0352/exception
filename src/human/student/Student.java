package human.student;

public class Student extends Human {
    int id;
    int course;
    String faculty;
    String speciality;

    public Student () {

    }

    public Student(String name, String surname, int age, int id, int course, String faculty, String speciality) {
        super(name, surname, age);
        this.id = id;
        this.course = course;
        this.faculty = faculty;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String gettingInfoAboutHuman() {

        return super.gettingInfoAboutHuman() + "" + "ID: " + id + " " +
                "Course: " + course +
                "Faculty:  " + faculty +
                "Speciality: " + speciality;

    }
}
