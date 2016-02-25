/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Chad Cochrane
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // KLUDGE: do configuration here
        DataAccessStrategy db = new FakeDatabase();
        
        //Start talking to objects
        Register register = new Register();
        register.startNewSale("100", db);
        
        //test so far..
        Customer customer = register.getReceipt().getCustomer();
        System.out.println("Customer", + customer.getCustName() + "found and added to receipt");
        
        register.addItemToSale("11", 12);
        register.addItemToSale("22", 1);
        
        LineItem[] items = register.getReceipt().getLineItems();
        for(LineItem item: items){
            System.out.println(item.getProductId().getProdName());
        }
        
    }
    
}
