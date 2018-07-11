package br.denis.bolao.entidade;

public class Usuario {
    
    private String login;
    private String senha;
    private int palpite1;
    private int palpite2;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPalpite1() {
        return palpite1;
    }

    public void setPalpite1(int palpite1) {
        this.palpite1 = palpite1;
    }

    public int getPalpite2() {
        return palpite2;
    }

    public void setPalpite2(int palpite2) {
        this.palpite2 = palpite2;
    }
    
}
