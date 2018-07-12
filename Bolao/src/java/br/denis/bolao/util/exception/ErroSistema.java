
package br.denis.bolao.util.exception;

/**
 *
 * @author Dênis Taironi
 */
public class ErroSistema extends Exception {

    public ErroSistema(String message) {
        super(message);
    }

    public ErroSistema(String message, Throwable cause) {
        super(message, cause);
    }
    
}