package DessertShopTests;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import DessertShop.Customer;
import DessertShop.Order;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testGetName() {
        // Creando un cliente con nombre y ID
        Customer customer = new Customer("Alice", 1000);
        assertEquals("Alice", customer.getName());
    }

    @Test
    void testGetCustomerID() {
        // Creando dos clientes con diferentes IDs
        Customer customer1 = new Customer("Bob", 1001);
        Customer customer2 = new Customer("Charlie", 1002);
        assertEquals(1001, customer1.getCustomerID());
        assertEquals(1002, customer2.getCustomerID());
    }

    @Test
    void testGetOrderHistoryInitiallyEmpty() {
        // Verificando que el historial de órdenes está vacío al principio
        Customer customer = new Customer("David", 1003);
        assertTrue(customer.getOrderHistory().isEmpty());
    }

    // Si quieres un setter de nombre, puedes agregarlo a la clase Customer
    @Test
    void testSetName() {
        Customer customer = new Customer("Eve", 1004);
        customer.setName("Eva");
        assertEquals("Eva", customer.getName());
    }

    @Test
    void testAddOrderToHistory() {
        // Añadiendo una orden al historial
        Customer customer = new Customer("Frank", 1005);
        Order order = new Order();
        customer.addOrderToHistory(order);  // Método correcto
        List<Order> history = customer.getOrderHistory();
        assertEquals(1, history.size());
        assertEquals(order, history.get(0));
    }
}

