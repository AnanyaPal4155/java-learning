import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Laptop", 60000));
        cart.add(new Product("Mouse", 1000));
        cart.add(new Product("Keyboard", 2000));
        cart.add(new Product("Monitor", 15000));

        System.out.println(cart.get(1).price);

        // Calculate total
        double total = 0;

        for (Product product : cart) {
            total += product.price;
        }

        System.out.println("Total Cart Price: " + total);


        // Search Keyboard
        boolean found = false;

        for (Product product : cart) {

            if (product.name.equals("Keyboard")) {

                System.out.println("Product Found: " + product.name);
                System.out.println("Price: " + product.price);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }


        // Print products above 10000
        System.out.println("Products above 10000:");

        for (Product product : cart) {

            if (product.price > 10000) {
                System.out.println(product.name + " " + product.price);
            }
        }

        // Remove product from the cart
        System.out.println("Before Remove:");
        for (Product product : cart) {
            System.out.println(product.name);
        }
        cart.remove(1); System.out.println("After Remove:");
        for (Product product : cart) {
            System.out.println(product.name);
        }

    }
}