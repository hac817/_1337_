package easy.stackusing2queues;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        boolean egals = s1.equals(s3);
        System.out.println(egals);
    }
}
