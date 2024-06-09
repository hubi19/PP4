package pl.hsolecki.ecommerce.sales.reservation;

import pl.hsolecki.ecommerce.sales.payment.PaymentDetails;
import pl.hsolecki.ecommerce.sales.payment.PaymentGateway;
import pl.hsolecki.ecommerce.sales.payment.RegisterPaymentRequest;

public class SpyPaymentGateway implements PaymentGateway {
    Integer requestCount = 0;
    public RegisterPaymentRequest lastRequest;
    public Integer getRequestCount() {
        return requestCount;
    }

    @Override
    public PaymentDetails registerPayment(RegisterPaymentRequest registerPaymentRequest) {
        this.requestCount++;
        lastRequest = registerPaymentRequest;
        return new PaymentDetails("http://spy-gateway");
    }
}