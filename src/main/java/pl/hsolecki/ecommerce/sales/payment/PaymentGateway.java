package pl.hsolecki.ecommerce.sales.payment;

public interface PaymentGateway {
    PaymentDetails registerPayment(RegisterPaymentRequest registerPaymentRequest);
}