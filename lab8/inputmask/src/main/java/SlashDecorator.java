public class SlashDecorator extends Decorator {

    public String slash ;

    public SlashDecorator() {
        slash = "/";
    }

    @Override
    public String display() {
        super.display();
        return slash;
    }


    @Override
    public void addSubComponent(IDisplayComponent c) {
        super.addSubComponent(c);
    }

    public String addDecorator(String date){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< date.length();i++ ){
            if(i==1) {
                builder.append(date.charAt(i));
                builder.append(slash);
            }
            else
                builder.append(date.charAt(i));
        }
        return builder.toString();
    }
}
