public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome,String senha){
        this.nome = nome;
        this.senha = senha;
        
    }
    public boolean login(String nome,String senha){
        return this.nome.equals(nome) && this.senha.equals(senha);
    }
}