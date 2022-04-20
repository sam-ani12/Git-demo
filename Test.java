public class Test {
    String s = null;

    public void nullPointer() {
        try {
            System.out.println(s.trim());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Demo().nullPointer();
    }
}