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
public class Register {
    private Receipt receipt;
    private String storeName;
    
    public final void startNewSale(String custId, DataAccessStrategy db){
        receipt = new Receipt(custId, db);
    }
    
    public final void endSale(){
}
    public final void addItemToSale(String prodId, int qty){
        receipt.addItemToReceipt(prodId, qty);
        
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
}
