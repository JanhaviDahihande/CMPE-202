  

public interface Component {

     String getDescription() ;
     String getPackingDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     double getPrice();
     String getPosition();

}
 
