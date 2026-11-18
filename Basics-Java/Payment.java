class Payment {

    public void gpay() {
        System.out.println("Pay amount through GPay");
    }

    public void phonepay() {
        System.out.println("Pay amount through PhonePe");
    }

    public void pytm() {
        System.out.println("Pay amount through Paytm");
    }

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.gpay();
        payment.phonepay();
        payment.pytm();
    }
}