public class Decorator implements IDisplayComponent {

    private IDisplayComponent component;

    public Decorator(){}

    @Override
    public String display() {
        return this.component.display();
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {
        component.addSubComponent(c);
    }

    public String addDecorator(String number){
        return number;
    }
}
