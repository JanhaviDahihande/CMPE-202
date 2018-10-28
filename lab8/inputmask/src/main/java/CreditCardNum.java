/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum  extends Screen implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private Decorator wrapper = null;
	private String number = "" ;

	public void setWrapper(Decorator wrapper){
		this.wrapper = wrapper;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else if(wrapper==null)
			return "[" + number + "]" + "  " ;
		else
			return "[" + wrapper.addDecorator(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
            if (ch.matches("x|X")) {
                number = number.replaceFirst(".$","");
            } else
                number += ch;
        }
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
	}

    @Override
    public String name() {
        return this.getClass().getName();
    }
}