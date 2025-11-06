package lec7;

public class Ex5_1 {
    public record Range(int min, int max) {

    }

    public static void main(String[] args) {
        Range range = new Range(0, 10);

        System.out.println("range: " + range.toString());
        System.out.println("min: " + range.min());
        System.out.println("max: " + range.max());
        System.out.println("hashCode: " + range.hashCode());
        System.out.println("equals to Range(-10, 10): " + range.equals(new Range(-10, 10)));
    }
}
