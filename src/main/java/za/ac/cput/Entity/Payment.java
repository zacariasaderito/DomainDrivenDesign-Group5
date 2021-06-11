package za.ac.cput.Entity;

/**Author: Chadleigh Dunbar (218065256)
 * Responsible for the Payment Entity
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

        public Builder PaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder PaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Payment build(){
            return new Payment(this);
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
