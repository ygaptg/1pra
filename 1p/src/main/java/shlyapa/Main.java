package shlyapa;
import java.lang.*;

public class Main {

    public static String ageMeter(int age) {

        if (age >= 0 & age < 18) {
            return "You are children";
        }
        else if (age >= 18 & age <= 35) {
            return "You are young";
        }
        else {
            return "You are old";
        }
    }

    public static void main(String[] args) {
        ageMeter(18);
    }
}
