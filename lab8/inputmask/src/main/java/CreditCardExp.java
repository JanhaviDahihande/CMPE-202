/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
    private Decorator wrapper = null;
	private String date = "" ;

	public void setWrapper(Decorator wrapper){
	    this.wrapper = wrapper;
    }

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else if(wrapper==null)
			return "[" + date + "]" + "  " ;
		else
            return "[" + wrapper.addDecorator(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ) {
            if (ch.matches("x")) {
                date = date.replaceFirst(".$", "");
            } else
                date += ch;
        }
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
	}

}