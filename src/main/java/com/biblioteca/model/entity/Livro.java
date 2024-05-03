package  com.biblioteca.model.entity;

public class Livro extends AbstractEntity {

  private String titulo;

  private String autor;

  private int numPaginas;
  
  private String nomeCliente;
  
  private String cpf;
  
  private int tempCliente;
  
  public Cliente(String nomeCliente, String cpf, int tempCliente) {
    this.nomeCliente = nomeCliente;
    this.cpf = cpf;
    this.tempCliente = tempCliente;
  }

  public Livro(String titulo, String autor, int numPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
  }
  
  public Cliente(int idCliente, String nomeCliente, String cpf, int tempCliente){
    super.setId(idCliente);
    this.nomeCliente = nomeCliente;
    this.cpf = cpf;
    this.tempCliente = tempCliente;
  }

  public Livro(int id, String titulo, String autor, int numPaginas) {
    super.setId(id);
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
  }
  
  public String getNomeCliente(){
    return nomeCliente;
  }
  
  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }
  
  public String getCpf(){
    return cpf;
  }
    
  public void setCpf(String cpf){
    this.cpf = cpf;
  } 
  
  public int getTempCliente(){
    return tempCliente;
  }
  
  public void setTempCliente(){
    this.tempCliente;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumPaginas() {
    return numPaginas;
  }

  public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
  }
}