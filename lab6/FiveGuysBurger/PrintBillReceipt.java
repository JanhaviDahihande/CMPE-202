import java.text.DecimalFormat;

public class PrintBillReceipt implements PrintStrategy
{
   String description = ""; 
   int counter = 0;
   
   public PrintBillReceipt(){
    }
    
    @Override
    public String getDescription(Order order){
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println( "\n**Bill Receipt**\n");
        System.out.println( order.getDescription());
        System.out.println( "\tSub. Total: \t\t$" + df.format(order.getPrice()));
        return "";
    }
}
