import java.util.*;
public interface State {
    public void insertCoins(List<Integer> coinList);
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
