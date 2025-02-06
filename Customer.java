package Projects.ShoppingManagementSystem;
//Represents a customer.
//Attributes: customerId, name, email, Cart.
//Methods: browseProducts(), addToCart(), removeFromCart(), checkout().


public class Customer {
    private final String customerId;
    private final String Name;
    private final String Email;
    private Cart cart;

    // Constructor to initialize the customer attributes
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.Name = name;
        this.Email = email;
        cart=new Cart();// Create a new cart for the customer
    }

    public String getCustomerId() {
        return customerId;
    }
    public String getName() {
        return Name;
    }
    public String getEmail() {
        return Email;
    }

    public Cart getCart() {
        return cart;
    }

    // Adds a product to the cart through the Cart class
    public void addProductToCart(Product product){
        cart.add_product(product);
        System.out.println(product.getName()+" is added to your cart");
    }

    // Removes a product from the cart through the Cart class.
    public void removefromcart(Product product){
        cart.remove_product(product);
        System.out.println(product.getName()+" is removed from your cart");
    }

    // Displays details of a product in the cart.
    public  void Browse_product(Product product){
        cart.Product_detail(product);
    }

    // Completes the checkout process.
    void checkout(){
        if (cart.isCartEmpty()) {// Check if the cart is empty.
            System.out.println("Your cart is empty. Please add some products before checking out.");
            return;
        }


        System.out.println("checking out...");
        cart.Display_Cart();// Display the cart details.
        System.out.println("Order ID: ORD"+System.currentTimeMillis());//Generate a unique order ID.
        System.out.println("order placed successfully");
        cart=new Cart();// Clear the cart and create a new instance

    }
}
