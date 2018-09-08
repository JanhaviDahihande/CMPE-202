import java.util.*;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoins(List<Integer> coinList) {
        System.out.println("You inserted a quarter");
        selectMachineNumber(coinList);
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
    
    public void selectMachineNumber(List<Integer> coinList){
    int coinListLength = coinList.size();
    
    switch(coinListLength){
                case 1 : 
                System.out.println("Machine 1 selected");
                MachineOne(coinList.get(0));
                break;
                
                case 2 : 
                System.out.println("Machine 2 selected");
                MachineTwo(coinList);
                break;
                
                default:
                System.out.println("Machine 3 selected");
                MachineThree(coinList);
                break;
            }
        }
        
        public void MachineOne(int coin){
        if ( coin == 25 )
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            else 
                gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void MachineTwo(List<Integer> coinList){
            if(coinList.get(0) == 25
            && coinList.get(1) == 25){
                System.out.println("Got two quarters");
                gumballMachine.setState(gumballMachine.getHasQuarterState());
                System.out.println("Process done");
            }
            else{
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
           
    }
    
    public void MachineThree(List<Integer> coinList){
        int total_coin = 0;
        for(int i=0; i<coinList.size();i++){
            total_coin = total_coin + coinList.get(i);
        }
        if(total_coin < 50){
           System.out.println("Awaiting money. You have entered less than 50 cents");
        }
        
        else if(total_coin == 50){
            gumballMachine.setState(gumballMachine.getHasQuarterState());
            System.out.println("Process done");
        }
        
        else
            System.out.println("You have entered more than 50 cents");
        
    }
}
