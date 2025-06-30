package EcommerceApplication.Service;
import EcommerceApplication.Entity.Orders;
import EcommerceApplication.Entity.Product;
import EcommerceApplication.Entity.User;

import java.util.*;

public class EcommerceService {
    public static Scanner sc = new Scanner(System.in);

    public static User addUser() {
        User user = new User();
        System.out.println("Enter the User Name : ");
        user.setName(sc.nextLine());
        System.out.println("Enter the Email : ");
        user.setEmail(sc.next());
        System.out.println("Enter the password : ");
        user.setPassword(sc.next());
        return user;
    }

    public static void displayProducts(HashMap<Integer, Product> products) {
        products.put(1, new Product("Jens pant", 1200, 5));
        products.put(2, new Product("Hp laptop", 71200, 3));
        products.put(3, new Product("Ear Buds", 1500, 8));
        products.put(4, new Product("Samsung Phone", 18200, 5));
        products.put(5, new Product("TV", 11200, 2));
        for (Map.Entry<Integer, Product> i : products.entrySet()) {
            System.out.println("Product Id : " + i.getKey() + "\nProduct Name : " + i.getValue().getName() + "\nProduct Price : " + i.getValue().getPrice() + "\nIn Stock : " + i.getValue().getStock());
            System.out.println();
        }
    }

    public static void addtoOrder(HashMap<Integer, Product> products, HashMap<Integer, User> users, HashMap<Integer, Orders> orders, int userId) {
        System.out.println("Enter the product Id : ");
        int i = sc.nextInt();
        if (!products.containsKey(i)) {
            System.out.println("Invalid product ID.");
        }
        Product product = products.get(i);
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        if (quantity > product.getStock()) {
            System.out.println("Sorry, only " + product.getStock() + " items in stock.");
        }
        System.out.println("Item name : "+product.getName()+"\nQuantity : "+quantity);
        System.out.println("Total Price : "+(product.getPrice()*quantity));
        System.out.println("Enter 1 to place order ");
        int n = sc.nextInt();
        if(n==1) {
            if (users.containsKey(userId)) {
                Orders order = orders.getOrDefault(userId, new Orders());
                if (order.getItems() == null) {
                    order.setItems(new HashMap<>());
                }
                HashMap<String, Integer> items = order.getItems();
                String productName = product.getName();
                items.put(productName, items.getOrDefault(productName, 0) + quantity);
                double itemTotal = product.getPrice() * quantity;
                order.setTotalPrice(order.getTotalPrice() + itemTotal);
                order.setStatus(true);
                order.setUserId(userId);
                if (users.containsKey(userId)) {
                    User user = users.get(userId);
                    order.setUserName(user.getName());
                }
                orders.put(userId, order);
                product.setStock(product.getStock() - quantity);
                System.out.println("Remaining stock for " + product.getName() + ": " + product.getStock());
                System.out.println("Order Placed successfully....");
            } else {
                System.out.println("order not placed");
            }
        }else {
            System.out.println("order not placed");
        }
    }
    public static void MyOrders(HashMap<Integer, User> users, HashMap<Integer, Orders> orders, int userid) {
         for (Map.Entry<Integer, Orders> order : orders.entrySet()) {
             if (users.containsKey(userid)) {
                 System.out.println("Order Id : " + order.getKey() + "  User Name : " + order.getValue().getUserName());
                 System.out.println("Order Items : " + order.getValue().getItems());
                 System.out.println("Total Price : " + order.getValue().getTotalPrice());
             }
         }

    }
}


