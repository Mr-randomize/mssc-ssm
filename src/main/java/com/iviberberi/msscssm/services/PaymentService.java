package com.iviberberi.msscssm.services;

import com.iviberberi.msscssm.domain.Payment;
import com.iviberberi.msscssm.domain.PaymentEvent;
import com.iviberberi.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declinePayment(Long paymentId);
}
