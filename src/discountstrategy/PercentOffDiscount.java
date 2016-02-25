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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;
    //cost quantity item
    
    public PercentOffDiscount(double discountRate){
        this.discountRate = discountRate;
    }
    
    public double getDiscountAmt(double unitPrice, double qty){
        return unitPrice *qty * discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
