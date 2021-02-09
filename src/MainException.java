import java.util.Arrays;

public class MainException {
    public static void main(String[] args) {
        int[] a = generateArray();
        int[] b = generateArray();
        int[] c = generateArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(getSummArray(a) + getSummArray(b) + getSummArray(c));


    }

    public static int[] generateArray() {
        int[] a = new int[5 + (int) (Math.random() * 16)];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        return a;
    }

    public static int getSummArray(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += i;

        }
        return summ;
    }
}




