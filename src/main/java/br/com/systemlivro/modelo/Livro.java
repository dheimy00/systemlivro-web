package br.com.systemlivro.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "livro")
public class Livro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@NotBlank(message = "O título é obrigatório")
	@Column(name = "TITULO")
	private String titulo;
	
	@NotBlank(message = "O descrição é obrigatório")
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull(message = "O preço é obrigatório")
	@Column(name = "PRECO")
	private BigDecimal preco;
		
	@NotNull(message = "ISBN é obrigatório")
	@Column(name = "ISBN")
	private Integer isbn;
	
	@NotNull(message = "O ano é obrigatório")
	@Column(name = "ANO")
	private Integer ano;
	
	@Column(name = "CRIAR_DATA")
	@CreationTimestamp
	private Date criarData;
	
	@Column(name = "ATUALIZAR_DATA")
	@UpdateTimestamp
	private Date atualizarData;

}
