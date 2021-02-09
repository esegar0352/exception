public class Main {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 1};
        System.out.println(getElem(array, 2));
        System.out.println(getElem(array, 7));

    }

    public static int getElem(int[] array, int index) {
        int result = 0;
        try {
            result = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за границу массив");

        }
        return result;
    }
}
