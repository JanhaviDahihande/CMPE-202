 

import java.text.DecimalFormat;


public class Leaf implements Component {

    protected String description ;
    protected Double price ;
    String desc;
    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public String getDescription() {
        return null;
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
    public String getPosition(){
       return null;
    }
    
    public double getPrice(){
        return 0.0;
   }
   
   public String getPackingDescription(){
       return null;
    }
     
}
 
