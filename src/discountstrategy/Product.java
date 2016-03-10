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
public class Product {
    private double unitPrice;
    private String prodId;
    private String name;
    private DiscountStrategy discount; 

   

    public Product(String prodId, String name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = name;
        this.discount = discount;
        this.unitPrice = unitPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountAmtSaved(int qty) {
        return discount.getDiscountAmt(unitPrice, qty);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    }

