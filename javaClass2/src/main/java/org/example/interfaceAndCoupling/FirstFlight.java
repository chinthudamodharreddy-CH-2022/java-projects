package org.example.interfaceAndCoupling;

public class FirstFlight implements IDelivery{
    @Override
    public String deliverProduct(double amount) {
        return "product delivered with FirstFlight successfully and amount is " +amount;
    }
}
