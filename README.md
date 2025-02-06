# Shopping Management System

A **Java-based Shopping Management System** that provides core functionalities like product browsing, cart management, order checkout, and inventory restocking. This project is built using object-oriented programming principles, making it an excellent example for learning and practicing Java concepts.

---

## **Features**
1. **Product Browsing**:
    - View available products with detailed information including name, price, description, and stock availability.

2. **Cart Management**:
    - Add products to the cart (quantity updates dynamically).
    - Remove products from the cart.
    - View cart details, including item-wise cost and total value.

3. **Order Processing (Checkout)**:
    - Place orders by checking out the cart.
    - Generate a unique order ID for each checkout.
    - Automatically clear the cart after successful checkout.

4. **Inventory Management**:
    - Restock products by adding more items to the inventory.

---

## **Technologies Used**
- **Language**: Java
- **IDE/Editor**: IntelliJ IDEA (or any similar Java IDE)
- **Concepts Used**:
    - Object-Oriented Programming (OOP)
    - Collections (`HashMap`, `ArrayList`)
    - Console-based user interaction
    - Dynamic inventory and cart management

---

## **Project Folder Structure**
The project consists of the following main classes:
1. **Product.java**:
    - Encapsulates details of a product such as `Product ID`, `Name`, `Price`, `Description`, `Category`, and `Stock Quantity`.
    - Provides functionalities for managing product information and stock updates.

2. **Cart.java**:
    - Implements a shopping cart using a `HashMap` to store products and their quantities.
    - Provides methods for adding, removing, and calculating the total cost of items in the cart.

3. **Customer.java**:
    - Represents a customer with attributes like `Customer ID`, `Name`, and `Email`.
    - Links the customer with a shopping cart and provides methods to manage their cart and checkout.

4. **Manage.java**:
    - The main class to interact with the system.
    - Provides a console-based menu for browsing products, adding/removing items from the cart, managing inventory, and placing orders.

---

## **Installation and Usage**
Follow the steps below to set up and run the project:

### **Step 1: Clone the Repository**
First, clone this repository to your local machine:
```bash
git clone https://github.com/<your-username>/ShoppingManagementSystem.git
```

### **Step 2: Open in an IDE**
- Open the downloaded project folder in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

### **Step 3: Run the Application**
- Locate the `Manage.java` file in the `Projects.ShoppingManagementSystem` package.
- Run the `main()` method in `Manage.java` to start the application.

---

## **How to Use**
1. **Launch the Application**:
    - The application starts with a console-based menu. Use the numbered options to navigate through the system.

2. **Menu Options**:
    - **1. Browse Products**: View details of all available products.
    - **2. Add Product to Cart**: Add a product to your cart by entering its `Product ID`.
    - **3. Remove Product from Cart**: Remove a certain product from your cart using its `Product ID`.
    - **4. View Cart**: Display cart contents and total value.
    - **5. Checkout**: Checkout your cart and generate a unique order ID.
    - **6. Restock Product**: Add more items to the inventory.
    - **7. Exit**: Exit the application.

---
