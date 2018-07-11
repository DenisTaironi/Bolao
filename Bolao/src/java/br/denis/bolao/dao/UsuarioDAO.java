package br.denis.bolao.dao;

import br.denis.bolao.entidade.Usuario;
import br.denis.bolao.util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public void salvar(Usuario usuario) {
        try {
            Connection con = FabricaConexao.getCon();
            PreparedStatement ps = con.prepareCall("INSERT...");
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            
            ps.execute();
            FabricaConexao.fecharConexao();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}