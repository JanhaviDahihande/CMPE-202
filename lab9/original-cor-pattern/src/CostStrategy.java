public class CostStrategy implements IStrategy {
    @Override
    public void execute(String[] arr) {

        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("Cheese"))
                arr1[i] = arr[i] + " $0.49";
            else if(arr[i].contains("Meat"))
                arr1[i] = arr[i] + " $0.59";
            else
                arr1[i] = arr[i] + " $0.00";
        }
        System.out.println("\nCost Strategy: ");
        for (String anArr1 : arr1) {
            System.out.println("\t" + anArr1);
        }
    }
}
