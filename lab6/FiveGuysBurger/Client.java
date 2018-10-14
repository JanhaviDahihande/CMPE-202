  

public class Client {

    public static void runTest()
    {
        Order theOrder = new Order("Order");
        Burger burger = new Burger("LBB", 1, 5.59);
        Toppings tomato = new Toppings("TOMATO", "top");
        Toppings lettuce = new Toppings("LETTUCE", "top");
        Toppings onion = new Toppings("ONION", "onMeat");
        Toppings jala = new Toppings("JALA Grilled", "onMeat");
        Toppings jalepeno = new Toppings("JALEPENO", "bottom");
        
        Bacon b = new Bacon("BACON");
        Fries f = new Fries("LTL CAJ", 1, 2.79);
        burger.addChild(tomato);
        burger.addChild(lettuce);
        burger.addChild(onion);
        burger.addChild(jala);
        burger.addChild(jalepeno);
        burger.addChild(b);
        
        //add fries
        
        theOrder.addChild(burger);
        theOrder.addChild(f);
        
        PrintPackingReceipt pReceipt = new PrintPackingReceipt();
        
        System.out.println(pReceipt.getDescription(theOrder));
        PrintBillReceipt bReceipt = new PrintBillReceipt();
        bReceipt.getDescription(theOrder);
        
    }
}
 
