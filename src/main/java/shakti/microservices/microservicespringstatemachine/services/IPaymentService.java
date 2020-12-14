package shakti.microservices.microservicespringstatemachine.services;

import org.springframework.statemachine.StateMachine;
import shakti.microservices.microservicespringstatemachine.domain.Payment;
import shakti.microservices.microservicespringstatemachine.domain.PaymentEvent;
import shakti.microservices.microservicespringstatemachine.domain.PaymentState;

public interface IPaymentService {

    Payment newPayment(Payment payment);
    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

}
