package org.example.interfaceAndCoupling;

public class FedEx implements IDelivery{
    @Override
    public String deliverProduct(double amount) {
        return "product delivered with FedEx successfully and amount is " +amount;
    }
}
