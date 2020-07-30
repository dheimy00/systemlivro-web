/*
 * package br.com.systemlivro.demo;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import br.com.systemlivro.modelo.Contato; import
 * br.com.systemlivro.modelo.Endereco; import br.com.systemlivro.modelo.Usuario;
 * import br.com.systemlivro.service.UsuarioService;
 * 
 * @Component public class MyRunner implements CommandLineRunner {
 * 
 * @Autowired private UsuarioService usuarioService;
 * 
 * 
 * private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
 * 
 * @Override public void run(String... args) throws Exception { // TODO
 * Auto-generated method stub //save();
 * 
 * //excluir(); }
 * 
 * 
 * public void excluir() { Usuario usuario = new Usuario(); usuario.setId(1L);
 * usuarioService.excluir(usuario.getId()); }
 * 
 * public void save() {
 * 
 * Usuario usuario = new Usuario(); Contato contato = new Contato(); Endereco
 * endereco = new Endereco();
 * 
 * 
 * contato.setCelular("62999157250"); contato.setTelefone("62999157250");
 * contato.setEmail("tarllyj@gmail.com");
 * 
 * endereco.setBairro("Bairro Feliz"); endereco.setCep("74630-280");
 * endereco.setComplemento("Apt. 1004 C"); endereco.setNumero(100);
 * endereco.setRua("Rua L11");
 * 
 * usuario.setNome("Dheimy"); usuario.setContato(contato);
 * usuario.setEndereco(endereco);
 * 
 * 
 * usuarioService.salvar(usuario); }
 * 
 * 
 * }
 */