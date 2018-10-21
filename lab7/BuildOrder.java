  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        //Burger 1
        CustomBurger customBurger_1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] po = { "Danish Blue Cheese" } ;
        pc.setOptions( po ) ;
        pc.wrapDecorator( c ) ;
        
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium topping +1.50
        PremiumToppings pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        
        Bun bun = new Bun( "Bun Options" ) ;
        String[] buno = { "Ciabatta (Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( pt ) ;
        
        Side side = new Side( "Side Options" ) ;
        String[] sides = { "Shoestring Fries" } ;
        side.setOptions( sides ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger_1.setDecorator( side ) ;
        customBurger_1.addChild( b ) ;
        customBurger_1.addChild( c ) ;
        customBurger_1.addChild( pc ) ;
        customBurger_1.addChild( s ) ;
        customBurger_1.addChild( t ) ;
        customBurger_1.addChild( pt ) ;
        customBurger_1.addChild( bun ) ;
        customBurger_1.addChild( side ) ;
        
        //Burger 2
         CustomBurger customBurger_2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] po2 = { "Fresh Mozzarella" } ;
        pc2.setOptions( po2 ) ;
        pc2.wrapDecorator( c2 ) ;
        
        // 1 sauce free, extra +.75
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        
        // 4 toppings free, extra +.75
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        
        // premium topping +1.50
        PremiumToppings pt2 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( pt2 ) ;
        
        Side side2 = new Side( "Side Options" ) ;
        String[] sides2 = { "Shoestring Fries" } ;
        side2.setOptions( sides2 ) ;
        side2.wrapDecorator( bun2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger_2.setDecorator( side2 ) ;
        customBurger_2.addChild( b2 ) ;
        customBurger_2.addChild( c2 ) ;
        customBurger_2.addChild( pc2 ) ;
        customBurger_2.addChild( s2 ) ;
        customBurger_2.addChild( t2 ) ;
        customBurger_2.addChild( pt2 ) ;
        customBurger_2.addChild( bun2 ) ;
        customBurger_2.addChild( side2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger_1 );
        order.addChild( customBurger_2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/