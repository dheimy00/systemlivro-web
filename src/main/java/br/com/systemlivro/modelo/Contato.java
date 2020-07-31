
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
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "contato")
public class Contato implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@NotBlank(message = "O telefone é obrigatório")
	@Column(name = "TELEFONE")
	private String telefone;

	@NotBlank(message = "O celular é obrigatório")
	@Column(name = "CELULAR")
	private String celular;

	@NotBlank(message = "O email é obrigatório")
	@Column(name = "EMAIL")
	private String email;

	@OneToOne(mappedBy = "contato", cascade = CascadeType.ALL)
	private Usuario usuario;

}
