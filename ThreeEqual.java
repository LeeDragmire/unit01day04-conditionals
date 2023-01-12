public class ThreeEqual {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a == b && b == c && c == a ) {
                System.out.println("The three numbers are equal");
            } else {
                System.out.println("the numbers are not equal");
            }
        } catch (Exception e) {
            System.out.println("try again");
        }
    }
}