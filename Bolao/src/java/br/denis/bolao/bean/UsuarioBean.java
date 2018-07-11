package br.denis.bolao.bean;

import br.denis.bolao.entidade.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class UsuarioBean {

    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario() {
        usuarios.add(usuario);
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
