public class ArrangementStrategy implements IStrategy {

    @Override
    public void execute(String[] arr) {
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].startsWith("->"))
                arr1[i] = arr[i].substring(2) + " on Bottom bun";
            else
                arr1[i] = arr[i] + " on Top bun";
        }
        System.out.println("Arrangement Strategy: ");
        for (String anArr1 : arr1) {
            System.out.println("\t" + anArr1);
        }
    }
}
