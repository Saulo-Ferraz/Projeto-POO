import java.util.Date;

public class Comentario {

        private Usuario autor;
        private String texto;
        public Date data;

        public Comentario() {}

        public Comentario(Usuario autor, String texto, Date data) {

            this.autor = autor;
            this.texto = texto;
            this.data = data;
        }

        public Usuario getAutor() {
            return autor;
        }
        public void setAutor(Usuario autor) {
            this.autor = autor;
        }
        public String getTexto() {
            return texto;
        }
        public void setTexto(String texto) {
            this.texto = texto;
        }
        public Date getData() {
            return data;
        }
        public void setData(Date data) {
            this.data = data;
        }
        
}