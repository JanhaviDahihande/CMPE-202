

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 10 );
		gumballMachine.insertQuarter( 10 );
		gumballMachine.insertQuarter( 5 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
