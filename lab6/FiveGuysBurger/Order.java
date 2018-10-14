  

public class Order extends Composite {
    
   double total = 0.0;
    public Order(String o){
        super(o);
    }
   
    @Override
    public String getDescription() 
    {
        String description = "";
        for (Component obj  : components)
        {
            description += "\n" + obj.getDescription();
        }
        return description;
    }
    
    @Override
    public String getPackingDescription() 
    {
        String description = "";
        for (Component obj  : components)
        {
            description += "\n" + obj.getPackingDescription();
        }
        return description;
    }
    
    @Override
    public double getPrice() {
        for (Component obj : components)
        {
            this.total += obj.getPrice();
        }
        return this.total;
    }


}