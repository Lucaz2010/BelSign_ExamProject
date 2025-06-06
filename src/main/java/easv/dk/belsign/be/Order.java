package easv.dk.belsign.be;

import java.sql.Timestamp;

public class Order {
    private int OrderID;
    private String OrderNumber; // Unique identifier for the order (e.g. "45-00000-0000")
    private String ProductDescription;
    private String OrderStatus; // ("Pending" or "Complete")
    private Timestamp CreatedAt;
    private Timestamp UpdatedAt;
    private String AssignedToUserID; // This will hold the name of the Operator
    private boolean hasRejectedPhotos;

    // Default constructor
    public Order() {

    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public Timestamp getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        CreatedAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        UpdatedAt = updatedAt;
    }

    public String getAssignedToUserID() {
        return AssignedToUserID;
    }

    public void setAssignedToUserID(String assignedToUserID) {
        AssignedToUserID = assignedToUserID;
    }

    public boolean isHasRejectedPhotos() {
        return hasRejectedPhotos;
    }

    public void setHasRejectedPhotos(boolean hasRejectedPhotos) {
        this.hasRejectedPhotos = hasRejectedPhotos;
    }

    // Builder Pattern
    // For constructing Order objects in a clean, chainable way
    // Useful when different users (e.g., QA Vs. Operator) need different amounts of data
    public static class Builder{
        private int orderID;
        private String orderNumber;
        private String productDescription;
        private String orderStatus;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private String assignedToUserID;

        public Builder withOrderID(int orderID) {
            this.orderID = orderID;
            return this;
        }
        public Builder withOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Builder withProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }
        public Builder withOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Builder withCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder withUpdatedAt(Timestamp updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Builder withAssignedToUserID(String assignedToUserID) {
            this.assignedToUserID = assignedToUserID;
            return this;
        }
        public Order build() {
            Order order = new Order();
            order.setOrderID(orderID);
            order.setOrderNumber(orderNumber);
            order.setProductDescription(productDescription);
            order.setOrderStatus(orderStatus);
            order.setCreatedAt(createdAt);
            order.setUpdatedAt(updatedAt);
            order.setAssignedToUserID(assignedToUserID);
            return order;
        }
    }

    @Override
    public String toString() {
        return getOrderNumber();
    }
}
