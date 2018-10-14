   

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description="" ;
    protected String printObj;
    
    public Composite ( String d )
    {
        description = d ;
    }

    public String getDescription() {
            return "";
    }
    
    public double getPrice(){
        return 0.0;
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
     
    public String getPosition(){
       return null;
    }
    
    public String getPackingDescription(){
    
        return null;
    }
}
 
