package br.jeronimo.ecommerce.checkout.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Builder // Ajuda no momento de instanciar essa class não será preciso se preocupar em usar a palavra chave "new"
@Data
@Entity
public class CheckoutEntity{
	
	@Id
	private Long id;
	
	@Column
	private String code;
}
