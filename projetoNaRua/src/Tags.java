public class Tags {
    
  private String nome;
  private String categoria;

    public Tags () {}

    public Tags (String nome, String categoria) {
          
          this.nome = nome;
          this.categoria = categoria;
      }

    public String getNome() {
          return nome;
      }
    public void setNome(String nome) {
          this.nome = nome;
      }
    public String getCategoria() {
          return categoria;
      }
    public void setCategoria(String categoria) {
          this.categoria = categoria;
      }
}