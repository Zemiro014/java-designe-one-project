package br.jeronimo.ecommerce.checkout.services;

import java.util.Optional;

import br.jeronimo.ecommerce.checkout.entity.CheckoutEntity;
import br.jeronimo.ecommerce.checkout.resources.CheckoutRequest;

public interface CheckoutService {
	
	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
	
}
