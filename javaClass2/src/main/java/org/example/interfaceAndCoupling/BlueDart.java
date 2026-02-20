package org.example.interfaceAndCoupling;

public class BlueDart implements IDelivery{
    @Override
    public String deliverProduct(double amount) {
        return "product delivered with BlueDart successfully and amount is " +amount;
    }
}
