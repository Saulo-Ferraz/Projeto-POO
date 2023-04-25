import java.util.ArrayList;

public class Usuario {
    
    private String username;
    private String senha;
    private String email;
    private String nomeCompleto;
    private String tipoUsuario;
    private int idUsuario;

    public Usuario() {}

    public Usuario(String username, String senha, String email, String nomeCompleto , 
                    String tipoUsuario, int idUsuario) {

        this.username = username;
        this.senha = senha;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.tipoUsuario = tipoUsuario;
        this.idUsuario = idUsuario;

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
