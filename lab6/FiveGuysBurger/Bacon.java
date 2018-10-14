public class Bacon extends Leaf
{
    String place;
    public Bacon(String d)
    {
        super(d);
        this.place="onMeat";
    }
    
    
    public String getDescription() 
    {
        String desc = "\t{{{ BACON }}}\n" ;
        
        return desc ;
    }
    
    public String getPosition(){
        return place;
   }
    
}
