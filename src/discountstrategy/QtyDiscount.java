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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate;
    private double minQty;
    //cost quantity item
    
    public QtyDiscount(double discountRate, double minQty){
        this.discountRate = discountRate;
        this.minQty = minQty;
    }
    
    @Override
    public double getDiscountAmt(double unitPrice, double qty){
        if(qty >= minQty){
            return  unitPrice *qty * discountRate;
        }else{
        return 0;
    }
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
