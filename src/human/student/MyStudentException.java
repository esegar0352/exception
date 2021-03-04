package human.student;

public class MyStudentException extends RuntimeException {
    @Override
    public String getMessage() {
        return "В группе может быть только 10 человек";
    }
}
