import java.util.Random;
import java.util.*;
import java.lang.*;
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    
    private int total_coin=0;
    private List<Integer> coinList = new ArrayList<Integer>();

    public GumballMachine( int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
            coinList.add(coin);
            System.out.println("You input " + coin + "cents");
    }
  
public void selectMachineNumber(){
    int coinListLength = coinList.size();
    
    switch(coinListLength){
                case 1 : 
                System.out.println("Machine 1 selected");
                MachineOne(coinList.get(0));
                break;
                
                case 2 : 
                System.out.println("Machine 2 selected");
                MachineTwo();
                break;
                
                default:
                System.out.println("Machine 3 selected");
                MachineThree();
                break;
            }
}
    
    public void turnCrank()
    {
        selectMachineNumber();
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your money.  Gumball Ejected!\n" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter.\n" ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert an appropriate amount\n" ) ;
        }   
        coinList.clear();
    }
    
    public void MachineOne(int coin){
        if ( coin == 25 )
                this.has_quarter = true ;
            else 
                this.has_quarter = false ;
    }
    
    public void MachineTwo(){
            if(coinList.get(0) == 25
            && coinList.get(1) == 25){
                System.out.println("Got two quarters");
                this.has_quarter= true;
                System.out.println("Process done");
            }
            else{
                this.has_quarter = false;
            }
           
    }
    
    public void MachineThree(){
        for(int i=0; i<coinList.size();i++){
            total_coin = total_coin + coinList.get(i);
        }
        if(total_coin < 50){
           System.out.println("Awaiting money. You have entered less than 50 cents");
        }
        
        else if(total_coin == 50){
            this.has_quarter = true ;
            System.out.println("Process done");
        }
        
        else
            System.out.println("You have entered more than 50 cents");
        
    }
}
