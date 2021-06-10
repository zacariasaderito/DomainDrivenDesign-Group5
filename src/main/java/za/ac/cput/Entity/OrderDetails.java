package za.ac.cput.Entity;
/** OrderDetails.java
 * Entity for Shopping Cart
 * Author: Mehluli Dlamini (219105359)
 * 11 June 2021
 Responsible for Order Details Entity**/
public class OrderDetails
{
    private int orderID;
    private int cusId;
    private String orderDate;
    private int shippingId;
    private String shippingDate;
    private String selectedAddress;
    private double shippingCost;
    private double orderPrice;
    private double totalPrice;
    /**public int calcTotal;
    public String placeOrder;
    public boolean cancelOrder;**/
    private OrderDetails(Builder builder){
        this.cusId = builder.cusId;
        this.orderID = builder.orderID;
        this.orderDate = builder.orderDate;
        this.orderPrice = builder.orderPrice;
        this.shippingId = builder.shippingId;
        this.shippingDate = builder.shippingDate;
        this.shippingCost = builder.shippingCost;
        this.selectedAddress = builder.selectedAddress;
        this.totalPrice = builder.totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderID=" + orderID +
                ", cusId=" + cusId +
                ", orderDate='" + orderDate + '\'' +
                ", shippingId=" + shippingId +
                ", shippingDate='" + shippingDate + '\'' +
                ", selectedAddress='" + selectedAddress + '\'' +
                ", shippingCost=" + shippingCost +
                ", orderPrice=" + orderPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder{
        private int orderID;
        private int cusId;
        private String orderDate;
        private int shippingId;
        private String shippingDate;
        private String selectedAddress;
        private double shippingCost;
        private double orderPrice;
        private double totalPrice;

        public void setOrderID(int orderID) {
            this.orderID = orderID;
        }

        public void setCusId(int cusId) {
            this.cusId = cusId;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public void setShippingId(int shippingId) {
            this.shippingId = shippingId;
        }

        public void setShippingDate(String shippingDate) {
            this.shippingDate = shippingDate;
        }

        public void setSelectedAddress(String selectedAddress) {
            this.selectedAddress = selectedAddress;
        }

        public void setShippingCost(double shippingCost) {
            this.shippingCost = shippingCost;
        }

        public void setOrderPrice(double orderPrice) {
            this.orderPrice = orderPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public OrderDetails build(){
            return new OrderDetails(this);
        }
        //This is my copy of the builder class
        public Builder copy(OrderDetails orderDetails){
            this.cusId = orderDetails.cusId;
            this.orderID = orderDetails.orderID;
            this.orderDate = orderDetails.orderDate;
            this.orderPrice = orderDetails.orderPrice;
            this.shippingId = orderDetails.shippingId;
            this.shippingDate = orderDetails.shippingDate;
            this.selectedAddress = orderDetails.selectedAddress;
            this.orderPrice = orderDetails.orderPrice;
            this.totalPrice = orderDetails.totalPrice;
            return this;
        }
    }
}
