public class SpaceDecorator extends Decorator {

    public String space ;

    public SpaceDecorator() {
        this.space = " ";
    }

    @Override
    public String display() {
        super.display();
        return space;
    }


    @Override
    public void addSubComponent(IDisplayComponent c) {
        super.addSubComponent(c);
    }

    @Override
    public String addDecorator(String cardNumber){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< cardNumber.length();i++ ){
            if(i==3 || i==7 || i==11) {
                builder.append(cardNumber.charAt(i));
                builder.append(space);
            }
            else
                builder.append(cardNumber.charAt(i));
        }
        return builder.toString();
    }


}
