package Projects.ShoppingManagementSystem;

public class Product {
//    Attributes of the product.
    private String ProductId;
    private String Name;
    private double Price;
    private String Description;
    private String Category;
    private int Quantity_Available;

//    constructor to instentiate a product object.
    public Product(String productId,String Name ,double price, String des,String category,int qnt) {
        this.ProductId = productId;
        this.Name=Name;
        this.Price=price;
        this.Description=des;
        this.Category=category;
        this.Quantity_Available=qnt;
    }

//    Getters and setters for all attributes.
    public String getProductId() {
        return ProductId;
    }
    public void setProductId(String productId) {
        ProductId = productId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public int getQuantity_Available() {
        return Quantity_Available;
    }
    public void setQuantity_Available(int quantity_Available) {
        Quantity_Available = quantity_Available;
    }

//  Reduces the stock by 1 when a product is purchased.
    void reduce_stock(){
        if(Quantity_Available>= 1){
            Quantity_Available-= 1;
        }else{
            System.out.println("Stock not available for: "+this.getName());
        }
    }

//  Displays all details of the product.
    void DisplayProductDetails(){
        System.out.println("ProductId= "+getProductId());
        System.out.println("Product Name= "+getName());
        System.out.println("Product Price= "+getPrice());
        System.out.println("About product= "+getDescription());
        System.out.println("Product Category= "+getCategory());
        System.out.println("Product Stock= "+getQuantity_Available());
    }

//   Adds a specified quantity to the product's stock.
    void Restock(int amount){
        if(amount>0){
            this.setQuantity_Available(getQuantity_Available()+amount);
            System.out.println("RESTOKED");
            System.out.println("Current stock of "+getName()+" is: "+getQuantity_Available());
        }else {
            System.out.println("INVALID RESTOCK AMOUNT");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ProductId.equals(product.ProductId);
    }
    @Override
    public int hashCode() {
        return ProductId.hashCode();
    }
}
