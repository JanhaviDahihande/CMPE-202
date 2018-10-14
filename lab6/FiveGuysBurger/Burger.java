import java.util.ArrayList;
public class Burger extends Composite
{
    private int quantity;
    private double price;
    
    public Burger( String d, int quantity, double price )
    {
        super(d) ;
        this.quantity = quantity;
        this.price = price;
    }
    
    @Override
    public double getPrice()
    {
       double finalPrice = quantity * price;
       return finalPrice;
    }
    
    @Override
    public String getDescription() 
    {
        String description1 = quantity + "\t" + description + "\t\t\t" + getPrice() + "\n";
        ArrayList<String> topBun = new ArrayList<String>();
        ArrayList<String> onMeat = new ArrayList<String>();
        ArrayList<String> bottomBun = new ArrayList<String>();
        for (Component obj  : components){
            if(obj.getPosition().equals("top"))
                topBun.add(obj.getDescription());
            if(obj.getPosition().equals("onMeat"))
                onMeat.add(obj.getDescription());
            if(obj.getPosition().equals("bottom"))
                bottomBun.add(obj.getDescription());
        }
        
        for (String str : topBun) {
           description1 += str; 
    }
    for (String str : onMeat) {
           description1 += str; 
    }
    for (String str : bottomBun) {
           description1 += str; 
    }
    
    return description1;
    }
    
    @Override
    public String getPackingDescription() 
    {
        String description1 = quantity + "\t" + description + "\t" +"\n";
        ArrayList<String> topBun = new ArrayList<String>();
        ArrayList<String> onMeat = new ArrayList<String>();
        ArrayList<String> bottomBun = new ArrayList<String>();
        for (Component obj  : components){
            if(obj.getPosition().equals("top"))
                topBun.add(obj.getDescription());
            if(obj.getPosition().equals("onMeat"))
                onMeat.add(obj.getDescription());
            if(obj.getPosition().equals("bottom"))
                bottomBun.add(obj.getDescription());
        }
        
        for (String str : topBun) {
           description1 += str; 
    }
    for (String str : onMeat) {
           description1 += str; 
    }
    for (String str : bottomBun) {
           description1 += str; 
    }
    
    return description1;
    }
    
    
}
