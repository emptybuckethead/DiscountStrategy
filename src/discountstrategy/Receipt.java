/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author ccochrane
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems; 
    private DataAccessStrategy db;
    
    
    public Receipt(String custId, DataAccessStrategy db) {
        customer = db.findCustomer(custId);
        lineItems = new LineItem[0]; 
        this.db = db;
    }
    // method to add new line item to receipt
    public final void addItemToReceipt(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty, db);
        addToArray(lineItems, item);
    }
    
    private void addToArray(LineItem[] origArray, LineItem item) {
        // needs validation
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length-1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }
    //get the total price of the items
    public double subtotalCost(){
        double sum = 0;
            for (double i : LineItem[2]){
                sum += i;
            }
            return sum;
    }
    //trick to fake resize of a Java Array
    //take the original array let's call it "theOriginal Array"
    //create a new temporary array called "tempArray"
    //make it 1 size larger than the original
    //copy all items in the original array to the tempArray
    //then add the new item to the tempArray
    //set the variable for the originalArray = tempArray -->orginalArray gets replaced

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public DataAccessStrategy getDb() {
        return db;
    }

    public void setDb(DataAccessStrategy db) {
        this.db = db;
    }
    
    
    
}
