package exercicio2;

public class Usuario {
	private String usuario;
	private int codigo;
	
	public Usuario() {
	}
	public Usuario(String usuario, int codigo) {
		this.usuario = usuario;
		this.codigo = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
