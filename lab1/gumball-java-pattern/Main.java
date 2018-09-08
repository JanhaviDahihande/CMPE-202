
import java.util.*;
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertCoins(Arrays.asList(25));
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoins(Arrays.asList(25,25));
        gumballMachine.turnCrank();
        
        gumballMachine.insertCoins(Arrays.asList(25,10,10,5));
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
