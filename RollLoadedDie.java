// good. (even though i hate switch statements)
public class RollLoadedDie {
    public static void main(String[] args) {
        double rand = Math.random() * 8;
        // Rounds the rand so it is 0-7 eight options and have the first 5 be the numbers and everything else 6
        switch ((int)rand) {
            case 0: System.out.println(1); break;
            case 1: System.out.println(2); break;
            case 2: System.out.println(3); break;
            case 3: System.out.println(4); break;
            case 4: System.out.println(5); break;
            default: System.out.println(6); break;
                
        }
    }
}
