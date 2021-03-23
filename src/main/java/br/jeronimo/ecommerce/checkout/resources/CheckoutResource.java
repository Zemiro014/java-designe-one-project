package br.jeronimo.ecommerce.checkout.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jeronimo.ecommerce.checkout.services.CheckoutService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {
	
	private final CheckoutService checkoutService;
	
	@PostMapping("/")
	public ResponseEntity<Void> crate(CheckoutRequest checkoutRequest){
		checkoutService.create(checkoutRequest);
		return ResponseEntity.ok().build();		
	}
}
