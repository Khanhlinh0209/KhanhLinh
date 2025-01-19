
package runtime;

import ui.Menu;

import data.FruitShopManagerment;
public class Program {

    
    public static void main(String[] args) {
        FruitShopManagerment fm = new FruitShopManagerment();
        fm.initData();
        Menu menu = new Menu("Fruit Shop Management System");
        menu.addNewOption("Add new Fruit");
        menu.addNewOption("View orders");
        menu.addNewOption("Shopping(for Buyer");
        
        
        
        
        
    }
    
}
