public class Bun extends LeafDecorator
{
    private String[] options ;
    
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    // premium cheese +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 ){
            for(String option:options){
                if(option.equals("Gluten-Free Bun") || option.equals("Hawaiian Bun"))
                    this.price+=1.00;
                else if(option.equals("Pretzel Bun"))
                    this.price+=0.50;
            }
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
