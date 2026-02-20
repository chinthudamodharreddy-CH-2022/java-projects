package org.example.interfaceAndCoupling;

public class Amazon{
    private IDelivery delivery;

    //when there is constructor and setter dependency injection is performed, setter injection will dominate the constructor injection.

    //constructor injection
    public Amazon(IDelivery delivery){
        this.delivery = delivery;
    }
    //setter injection
    public void setiDelivery(IDelivery delivery) { // IDelivery delivery = new FedEx();
        this.delivery = delivery;
    }

    public String deliverProduct(double amount) {
        return delivery.deliverProduct(500);
    }
}
