package human.student;

public class MyStudentExeption extends Exception {
    @Override
    public String getMessage() {
        return "В группе может быть только 10 человек";
    }
}
