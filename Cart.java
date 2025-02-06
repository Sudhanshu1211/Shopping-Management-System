package Projects.ShoppingManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {

//    {Way to store products in cart using list but you cannot store its quanntity.
//    private List<Product> card;
//
//    public Cart() {
//        card= new ArrayList<>();
//    }
//    void add_product(Product product){
//        card.add(product);
//    }
//    void remove_product(Product product){
//        card.remove(product);
//    }
//    void productdetail(Product product){
//        for (Product p: card){
//            if(p==product){
//                product.DisplayProductDetails();
//                return;
//            }
//        }
//        System.out.println("no product");
//    }
//    public double Calculatetotal(){
//        double total=0;
//        for (Product p:card){
//            total+=p.getPrice();
//        }
//        return total;
//    }
//    void Display_Cart(){
//        if(card.isEmpty()){
//            System.out.println("Cart is empty");
//        }else {
//            System.out.println("Your cart contains:");
//            for (Product p:card){
//                p.DisplayProductDetails();
//                System.out.println("===============================");
//            }
//        }
//        System.out.println("TOTAL: "+Calculatetotal());
//    }

//    Way to store products using hashmap .
//    we can store product as well as their quantities.
    private final Map<Product,Integer> cart1;

//    constructor
    public Cart() {
        cart1 = new HashMap<>();
    }

//    add a prooduct to the cart.
    public void add_product(Product product){
        int stock= product.getQuantity_Available();
        if (stock>0){
//            Add product to cart and increase quantity if it already exists
            cart1.put(product, cart1.getOrDefault(product,0)+1);
            System.out.println(product.getName()+" is added to cart.");
//            deccrease the stock of the product.
            product.reduce_stock();
        }else {
            System.out.println(product.getName()+" IS OUT OF STOCK (AVAILABLE: "+product.getQuantity_Available()+").");
        }
//        cart1.put(product, cart1.getOrDefault(product,0)+1);
//        System.out.println(product.getName()+" is added to cart.");
    }

//    remove a product to the cart.
    public void remove_product(Product product){
        if (cart1.containsKey(product)){
//            check if the product is in the cart.
            int quantity= cart1.get(product);
            if (quantity>1){
//               if the more than 1 quantity of the product is present.
//               reduce the quantity of the product in the cart.
                cart1.put(product,quantity-1);
            }
            else {
//                if only one item present .remove it from the cart.
                cart1.remove(product);
            }
//            restore the stock.
            product.setQuantity_Available(product.getQuantity_Available()+1);
            System.out.println(product.getName()+" is removed");
        }
        else {
            System.out.println(product.getName()+" is not found");
        }
    }

//    display the specific product
    void Product_detail(Product product){
        if (cart1.containsKey(product)){
            int cart_quantity= cart1.get(product);
            System.out.println("In Cart Quantity: "+cart_quantity);
        }
        product.DisplayProductDetails();
    }

//    Displays all items in the cart with their details and the total value.
    void Display_Cart(){
        if(cart1.isEmpty()){
            System.out.println("Your Cart is EMPTY");
            return;
        }else {
            double total=0;
            System.out.println("YOUR CART DETAILS: ");
            for (Map.Entry<Product,Integer> entry: cart1.entrySet()){
                Product p= entry.getKey();
                int quantity= entry.getValue();
                // Calculate total price for this product (price * quantity).
                double total_product_price= calculate_total_for_product(p,quantity);
                total+=total_product_price;
                // Display product information.
                System.out.println("Product: "+p.getName()+"\n"+"Description: "+p.getDescription()+"\n"+"Quantity: "+quantity+"\n"+"TOTAL: RS"+total_product_price);
                System.out.println("==========================================");
            }
            // Display the grand total of the cart.
            System.out.println("TOTAL CART VALUE: RS"+total);
        }
    }

    // Helper method to calculate the total for a specific product quantity.
    public double calculate_total_for_product(Product product, int quantity){
        return product.getPrice()*quantity;
    }

    // Helper method to check whether the cart is empty.
    public boolean isCartEmpty(){
        return cart1.isEmpty();
    }

}
