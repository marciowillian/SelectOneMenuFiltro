package com.mwcc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final List<Interesse> INTERESSES = new ArrayList<>();
	
	static {
		INTERESSES.add(new Interesse("Esportes", "esporte"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Cinema", "cinema"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}
	
	private String nome;
	private Interesse interesse;
	
	public void atualizar(){
		
		System.out.println("Interesse: " + this.interesse.getDescricao());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
		
	}
	
	public List<Interesse> getInteresses(){
		return INTERESSES;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}

		
	
}
