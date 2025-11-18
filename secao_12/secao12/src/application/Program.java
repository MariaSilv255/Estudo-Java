package application;

import java.util.Date;

import entitie.enums.OrderStatus;
import entities.Order;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		 OrderStatus os1 = OrderStatus.DELIVERED;
		 OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		 
		 System.out.println(os1);
		 System.out.println(os2);
		
	}
}
