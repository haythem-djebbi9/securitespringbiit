package com.example.MyProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPays;
	
	private String nomPays;
	private String continent;
	 @JsonIgnore
	@OneToMany(mappedBy = "pays")
	private List<Marque> marques;
	public Long getIdPays() {
		return idPays;
	}
	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public List<Marque> getMarques() {
		return marques;
	}
	public void setMarques(List<Marque> marques) {
		this.marques = marques;
	}

	

	
	
}
