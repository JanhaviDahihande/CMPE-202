public class Fries extends Leaf
{
    private double price;
    private int quantity;
    public Fries(String d, int quantity, double price)
    {
        super(d);
        this.quantity=quantity;
        this.price = price;
    }
    
    
    public String getDescription() 
    {
        String desc = quantity + "\t" + description + "\t\t\t" + getPrice() + "\n";
        
        return desc ;
    }
    
    public String getPackingDescription(){
        String desc = quantity + "\t" + description + "\n";
        
        return desc ;
    }
    
    public double getPrice(){
        return this.price * this.quantity;
   }
    
}
