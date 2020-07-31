package br.com.systemlivro.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@NotBlank(message = "Rua é obrigatório")
	@Column(name = "Rua")
	private String rua;
	
	@NotNull(message = "O numero é obrigatório")
	@Column(name = "NUMERO")
	private Integer numero;
	
	@NotBlank(message = "O bairro é obrigatório")
	@Column(name = "BAIRRO")
	private String bairro;
	
	@NotBlank(message = "O complmento é obrigatório")
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@NotBlank(message = "O cep é obrigatório")
	@Column(name = "CEP")
	private String cep;
	
	@OneToOne(mappedBy = "endereco",cascade = CascadeType.ALL)
	private Usuario usuario;


}
