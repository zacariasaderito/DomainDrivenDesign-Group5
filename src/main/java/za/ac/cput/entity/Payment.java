package za.ac.cput.entity;

/** Payment.java
 * Entity for Payment
 * Author: Chadleigh Dunbar (218065256)
 * Date: 11 June 2021
 */

public class Payment{

    private String paymentId;
    private String paymentType;

    /** public String confirmPayment;
     * public String cancelPayment;
     * @param builder
     */

    private Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.paymentType = builder.paymentType;
    }

    public static class Builder{
        private String paymentId;
        private String paymentType;

        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }

        public Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.paymentType = payment.paymentType;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
