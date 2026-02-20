package org.example.interfaceAndCoupling;

public class LaunchDelivery {
    public static void main(String[] args) {
        Amazon amazon = new Amazon(new BlueDart());

        //DependencyInjection: injecting the dependent class object FedEx() into the target class amazon is called dependency Injection
        //setter injection : here the dependency injection is performed using setter.

        amazon.setiDelivery(new FedEx());
        String message =  amazon.deliverProduct(500);
        System.out.println(message);

    }
}
