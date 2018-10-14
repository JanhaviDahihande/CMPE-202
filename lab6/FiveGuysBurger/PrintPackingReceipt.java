

public class PrintPackingReceipt implements PrintStrategy
{
    String description = ""; 
    
    @Override
    public String getDescription(Order order){
        description += "\n**Packing Receipt**\n";
        description += order.getPackingDescription();
        return description;
    }
}
