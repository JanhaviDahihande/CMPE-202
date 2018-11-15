import java.util.Arrays;

public class Tester {
    private final IStrategy strategy;
    public Tester(IStrategy s) {
        this.strategy = s;
    }

    public String[] test(String[] s){
        return strategy.execute(s);
    }

    public static void main(String[] args){
        String[] arr= {"Meat", "->Tomato", "Lettuce", "->Onion"};

        Tester t1 = new Tester((String[] s)  -> {
            String[] arr1 = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].startsWith("->"))
                    arr1[i] = arr[i].substring(2) + " on Bottom bun";
                else
                    arr1[i] = arr[i] + " on Top bun";
            }
            return arr1;
        });
        Tester t2 = new Tester((String[] s)  -> {
            String[] arr2 = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
               if(arr[i].contains("Tomato"))
                   arr2[i] = arr[i] + " $0.49";
               else if(arr[i].contains("Onion"))
                   arr2[i] = arr[i] + " $0.59";
               else
                   arr2[i] = arr[i] + " $0.00";
            }
            return arr2;
        });

        System.out.println(Arrays.toString(t1.test(arr)));
        System.out.println(Arrays.toString(t2.test(arr)));
    }
}
