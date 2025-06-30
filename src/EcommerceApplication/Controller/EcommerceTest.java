package EcommerceApplication.Controller;

import EcommerceApplication.Entity.Orders;
import EcommerceApplication.Entity.Product;
import EcommerceApplication.Entity.User;
import EcommerceApplication.Service.EcommerceService;
import EcommerceApplication.Repository.OrderRepository;
import EcommerceApplication.Repository.ProductRepository;
import EcommerceApplication.Repository.UserRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class EcommerceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, User> users = UserRepository.user;
        HashMap<Integer, Product> products = ProductRepository.products;
        HashMap<Integer, Orders> orders = OrderRepository.orders;
        System.out.println("-------E-Commerce Application--------");
        System.out.println();
        System.out.println("Enter the details for Login ");
        User user = EcommerceService.addUser();
        int userId;
        Random rand = new Random();
        do {
            userId = rand.nextInt(9) + 100;
        } while (users.containsKey(userId));
        users.put(userId, user);
        System.out.println("\nUser Details: ");
        for (Map.Entry<Integer, User> i : users.entrySet()) {
            if (i.getKey() == userId) {
                System.out.println("Name:" + i.getValue().getName());
                System.out.println("Email:" + i.getValue().getEmail());
            }
        }
        System.out.println();
        while (true) {
            System.out.println("1.View the product \n2.Order the product \n3.My Orders \n4.Logout");
            System.out.println("Enter the option ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("-----Product Details------");
                    EcommerceService.displayProducts(products);
                    break;
                case 2:
                    System.out.println("-----Order the Product------");
                    EcommerceService.addtoOrder(products, users, orders, userId);
                    break;
                case 3:
                    System.out.println("-----My Orders------");
                    EcommerceService.MyOrders(users, orders, userId);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Successfully logged out");
                    exit(0);
                    break;
                default:
                    System.out.println("Enter the valid Option");
            }
        }

    }
}
