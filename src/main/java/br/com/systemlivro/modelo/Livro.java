package br.com.systemlivro.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Livro implements Serializable {

	private static final long serialVersionUID = -5792663478663015507L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "LIVRO_TITULO")
	private String livroTitulo;
	
	@Column(name = "AUTOR_NOME")
	private String autorNome;
	
	@Column(name = "LIVRO_DESCRICAO")
	private String livroDescricao;
	
	@Column(name = "LIVRO_PRECO")
	private int livroPreco;
	
	@Column(name = "ISBN")
	private int isbn;
	
	@Column(name = "CRIAR_DATA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date criarData;
	
	public Livro(){}
	
	public Livro(String livroTitulo, String autorNome, String livroDescricao, int livroPreco, int isbn,
			Date criarData) {
		super();
		this.livroTitulo = livroTitulo;
		this.autorNome = autorNome;
		this.livroDescricao = livroDescricao;
		this.livroPreco = livroPreco;
		this.isbn = isbn;
		this.criarData = criarData;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLivroTitulo() {
		return livroTitulo;
	}

	public void setLivroTitulo(String livroTitulo) {
		this.livroTitulo = livroTitulo;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	public String getLivroDescricao() {
		return livroDescricao;
	}

	public void setLivroDescricao(String livroDescricao) {
		this.livroDescricao = livroDescricao;
	}

	public int getLivroPreco() {
		return livroPreco;
	}

	public void setLivroPreco(int livroPreco) {
		this.livroPreco = livroPreco;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Date getCriarData() {
		return criarData;
	}

	public void setCriarData(Date criarData) {
		this.criarData = criarData;
	}

	@Override
	public String toString() {
		return "Livro [livroTitulo=" + livroTitulo + ", autorNome=" + autorNome + ", livroDescricao=" + livroDescricao
				+ ", livroPreco=" + livroPreco + ", isbn=" + isbn + ", criarData=" + criarData + "]";
	}
	
	
	
	



}
