package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	public static DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime data;
	private String titulo;
	private String conteudo;
	private Integer likes;

	List<Comentario> comentarios = new ArrayList<>();

	public Post(LocalDateTime data, String titulo, String conteudo, Integer likes) {
		this.data = data;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Post() {
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}

	public void delComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes + " Likes - ");
		sb.append(data.format(formatacao) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentario\n");
		
		for (Comentario comentario : comentarios) {
			sb.append(comentario.getText() + "\n");
		}
		
		return sb.toString();
	}

}
