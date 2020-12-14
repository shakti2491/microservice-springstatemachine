package shakti.microservices.microservicespringstatemachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shakti.microservices.microservicespringstatemachine.domain.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Long> {
}
