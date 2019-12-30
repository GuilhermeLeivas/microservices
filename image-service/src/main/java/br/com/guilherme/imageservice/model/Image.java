package br.com.guilherme.imageservice.model;

public class Image {

	private Integer id;

	private String descricao;

	private String url;

	public Image(Integer id, String descricao, String url) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
