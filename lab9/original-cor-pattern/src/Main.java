import java.util.Arrays;

public class Main
{
    private final IStrategy strategy;
    public Main(IStrategy s) {
        this.strategy = s;
    }

    public void test(String[] s){
        strategy.execute(s);
    }

    public static void main(String[] args){
        String[] arr= {"Cheese", "->Tomato", "Lettuce", "->Onion", "Meat"};
        Main main1 = new Main(new ArrangementStrategy());
        main1.test(arr);

        Main main2 = new Main(new CostStrategy());
        main2.test(arr);
    }
}
