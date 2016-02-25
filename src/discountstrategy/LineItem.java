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
public class LineItem {
    //line item "Has A" product, but only one
    private int qty;
    private Product product;
    private DataAccessStrategy db;
    
    //constructor-- pass in productID and quantity
    public LineItem(String prodId, int qty, DataAccessStrategy db) {
        this.db = db;
        product = db.findProduct(prodId);
        this.qty = qty;
    }
    
    public String getProductId() {
        return product.getProdId();
    }
    
    public String getProductName() {
        return product.getName();
    }
    
    public double getProductPrice() {
        return product.getUnitPrice();
    }
    
    public double getSubtotal() {
        return product.getUnitPrice() * qty;
    }
    
    public double getAmountSaved() {
        return product.getDiscountAmtSaved(qty);
    }
    
//    public String toString() {
//        return getProductId() + "   " + getProductName() + "   " + 
//    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }




    
}

