package br.com.systemlivro.test;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ApplicationTests {
	
	
//	@InjectMocks
//	private UsuarioRespository usuarioRespository;
//	
//	@Mock
//	private UsuarioService usuarioService;
//	
//	@Before(value = "")
//    public void init() {
//    	MockitoAnnotations.initMocks(this);
//    }
//    
//	
//	@Test
//	public void lista() {
//		List<Usuario> listas = usuarioRespository.findAll();
//		Assertions.assertEquals(listas.size(),0);
//	}
//	
//	@Test 
//	public void get() {
//		Usuario usuario = new Usuario();
//		
//		usuario.setId(1L);
//		
//		when(usuarioRespository.findById(1L).get()).thenReturn(usuario);
//
//		Usuario user =  usuarioService.get(1L);
//		
//		verify(usuarioService).get(1L);
//		
//		Assertions.assertEquals(1L,user.getId());
//		
//	}
//	
//	@Test
//	 public void save() {
//		  
//		  Usuario usuario = new Usuario();
//		  Contato contato = new Contato();
//		  Endereco endereco = new Endereco();
//		  		  
//		  contato.setCelular("62999157250");
//		  contato.setTelefone("62999157250");
//		  contato.setEmail("tarllyj@gmail.com");
//		  
//		  endereco.setBairro("Bairro Feliz"); 
//		  endereco.setCep("74630-280");
//		  endereco.setComplemento("Apt. 1004 C");
//		  endereco.setNumero(100);
//		  endereco.setRua("Rua L11");
//		  
//		  usuario.setNome("Dheimy"); 
//		  usuario.setContato(contato);
//		  usuario.setEndereco(endereco);
//		  
//		  doReturn(usuario).when(usuarioRespository).save(any());
//		  
//		  
//		  Usuario  us = usuarioService.salvar(usuario);
//		  
//		  Assertions.assertNotNull(us,"The saved widget should not be null");
//		  Assertions.assertEquals(2,us.getNome(),"Dheimy"); 
//		  
//		  }
//	
	


}
