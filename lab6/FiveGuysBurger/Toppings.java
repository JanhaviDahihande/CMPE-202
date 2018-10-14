public class Toppings extends Leaf
{
    private String onBun ;
    
    
    public Toppings( String d, String onBun)
    {
        super(d) ;
        this.onBun = onBun;
    }
    
    public String getDescription() 
    {
        if(onBun.equals("onMeat"))
            return "\t->|" + description + "\n";
        else
            return "\t " + description + "\n";
    }
    
    public String getPosition(){
        return onBun;
    }
    
}