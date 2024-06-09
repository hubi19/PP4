package pl.hsolecki.ecommerce.infrastructure;

import pl.hsolecki.ecommerce.sales.payment.PaymentDetails;
import pl.hsolecki.ecommerce.sales.payment.PaymentGateway;
import pl.hsolecki.ecommerce.sales.payment.RegisterPaymentRequest;

public class PayUPaymentGateway implements PaymentGateway {
    @Override
    public PaymentDetails registerPayment(RegisterPaymentRequest registerPaymentRequest) {
        return null;
    }
}