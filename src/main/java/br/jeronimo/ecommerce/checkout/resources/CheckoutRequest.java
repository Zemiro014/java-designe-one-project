package br.jeronimo.ecommerce.checkout.resources;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Permite que uma class use apenas as variáveis sem se preocupar com os gatters e setters, HashCode e nem os construtores
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String  lastName;
	private String  userName;
	private String  email;
	private String  address;
	private String  complement;
	private String  country;
	private String  state;
	private String  cep;
	private Boolean  saveAddress;
	private Boolean  saveInfo;
	private String  paymentMethod;
	private String  cardName;
	private String  cardNumber;
	private String cardDate;
	private String  cardCvv;
}
