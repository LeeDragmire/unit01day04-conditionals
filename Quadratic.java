// good
public class Quadratic {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            // System.out.println(a + " | " + b + " | " + c + " | ");
            if (a == 0) {
                double answer = (double) -c / (double) b;
                System.out.println(a + " | " + b + " | " + c + " | " + answer);
            } else {
                double check = Math.pow(b, 2) - 4*a*c;
                if (check < 0) {
                    System.out.println("No Solution");
                } else {
                    double answer1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
                    double answer2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
                    System.out.println(a + " | " + b + " | " + c + " | " + answer1 + ", " + answer2);
                }
                
            }
        } catch (Exception e) {
            System.out.println("try again");
        }
    }
}
