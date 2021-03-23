package br.jeronimo.ecommerce.checkout.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.jeronimo.ecommerce.checkout.entity.CheckoutEntity;
import br.jeronimo.ecommerce.checkout.repository.CheckoutRepository;
import br.jeronimo.ecommerce.checkout.resources.CheckoutRequest;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor //Ele garante que se crie um construtor para todos os parâmetros declarados durante a execução
public class CheckoutServiceImplement implements CheckoutService {

	private final CheckoutRepository checkoutRepository;

	@Override
	public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
		final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
				.code(UUID.randomUUID().toString())
				.id(null)
				.build(); // Construindo um objecto usando @Builder Lombok
		
		return Optional.of(checkoutRepository.save(checkoutEntity));
	}
}
