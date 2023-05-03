package com.example.MyProject.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Marque {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		private Long idMarque;
		public Long getIdMarque() {
			return idMarque;
		}

		public void setIdMarque(Long idMarque) {
			this.idMarque = idMarque;
		}

		public String getNomMarque() {
			return nomMarque;
		}

		public void setNomMarque(String nomMarque) {
			this.nomMarque = nomMarque;
		}

		public Double getChiffreaffaire() {
			return chiffreaffaire;
		}

		public void setChiffreaffaire(Double chiffreaffaire) {
			this.chiffreaffaire = chiffreaffaire;
		}

		public Date getDateValidation() {
			return dateValidation;
		}

		public void setDateValidation(Date dateValidation) {
			this.dateValidation = dateValidation;
		}

		public String getSecteurActivite() {
			return secteurActivite;
		}

		public void setSecteurActivite(String secteurActivite) {
			this.secteurActivite = secteurActivite;
		}

		public String getSlogan() {
			return slogan;
		}

		public void setSlogan(String slogan) {
			this.slogan = slogan;
		}

		private String nomMarque;
		private Double chiffreaffaire;
		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date dateValidation;
		private String secteurActivite;
		private String slogan ;
		
		@ManyToOne
		private Pays pays;
	

	
		public Marque() {
			super();
			}

		public Marque(String nomMarque, Double chiffreaffaire, Date dateValidation,String secteurActivite,String slogan) {
			super();
			this.nomMarque = nomMarque;
			this.chiffreaffaire = chiffreaffaire;
			this.dateValidation = dateValidation;
			this.secteurActivite=secteurActivite;
			this.slogan=slogan;
			

			
			
			}

		@Override
		public String toString() {
			return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque + ", chiffreaffaire=" + chiffreaffaire
					+ ", dateValidation=" + dateValidation + ", secteurActivite=" + secteurActivite + ", slogan="
					+ slogan + "]";
		}

		public Pays getPays() {
			return pays;
		}

		public void setPays(Pays pays) {
			this.pays = pays;
		}
}