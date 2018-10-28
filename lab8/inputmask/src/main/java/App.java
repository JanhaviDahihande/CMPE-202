/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        num.setWrapper(new SpaceDecorator());
        exp.setWrapper(new SlashDecorator());
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.matches("1|2|3|4|5|6|7|8|9|0")) {
            if(count < 23)
                count = count + 1;
            else
               count = count + 0;
            System.out.println("Screen: " + screen.name());
            screen.key(ch, count);
        }
        System.out.println("\nCount = " + count);
        if(ch.matches("x|X") && count>0) {
            screen.key(ch, count);
            count--;
        }
    }

}

