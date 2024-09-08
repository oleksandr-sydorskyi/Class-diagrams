import java.util.List;

public class ClassDiagrams {

    // VendingMachine class
    public class VendingMachine {
        private List<Product> availableProducts;
        private List<String> acceptedPaymentMethods;
        private String currentLanguage;

        // Constructor
        public VendingMachine(List<Product> availableProducts, List<String> acceptedPaymentMethods, String currentLanguage) {
            this.availableProducts = availableProducts;
            this.acceptedPaymentMethods = acceptedPaymentMethods;
            this.currentLanguage = currentLanguage;
        }

        // Public methods
        public void selectProduct(int productID) {
            // Logic to select a product by ID
        }

        public void displayProducts() {
            // Logic to display available products
        }

        public void dispenseProduct() {
            // Logic to dispense a product
        }
    }

    // Product class
    public class Product {
        private String name;
        private double price;
        private int quantity;
        private String type;

        // Constructor
        public Product(String name, double price, int quantity, String type) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.type = type;
        }

        // Public methods
        public void adjustCustomization(String option) {
            // Logic to adjust customization of the product
        }
    }

    // PaymentSystem class
    public class PaymentSystem {
        private String paymentMethod;
        private boolean transactionStatus;

        // Constructor
        public PaymentSystem(String paymentMethod, boolean transactionStatus) {
            this.paymentMethod = paymentMethod;
            this.transactionStatus = transactionStatus;
        }

        // Public methods
        public boolean processPayment() {
            // Logic to process payment
            return true;  // assuming payment is successful
        }

        public void refund() {
            // Logic to process a refund
        }
    }

    // User class
    public class User {
        private Product selectedProduct;
        private String paymentMethod;

        // Constructor
        public User(Product selectedProduct, String paymentMethod) {
            this.selectedProduct = selectedProduct;
            this.paymentMethod = paymentMethod;
        }

        // Public method
        public boolean makePayment() {
            // Logic to make payment
            return true;
        }
    }

    // MaintenancePersonnel class
    public class MaintenancePersonnel {
        private String maintenanceID;

        // Constructor
        public MaintenancePersonnel(String maintenanceID) {
            this.maintenanceID = maintenanceID;
        }

        // Public methods
        public void checkStock() {
            // Logic to check stock levels
        }

        public void refillStock() {
            // Logic to refill stock in the machine
        }
    }
}
