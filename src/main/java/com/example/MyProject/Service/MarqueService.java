package com.example.MyProject.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.MyProject.entities.Marque;
import com.example.MyProject.entities.Pays;

public interface MarqueService {
	Marque saveMarque(Marque m);
	Marque updateMarque(Marque m);
	void deleteMarque(Marque m);
	 void deleteMarqueById(Long id);
	 Marque getMarque(Long id);
	List<Marque> getAllMarque();
	Page<Marque> getAllMarquesParPage(int page, int size);
	List<Marque> findByNomMarque(String nom);
	List<Marque> findByNomMarqueContains(String nom);
	List<Marque> findByNomChiffreAffaire(String nom, Double chiffreAffaire);
	List<Marque> findByPays(Pays pays);
	List<Marque> findByPaysIdPays(Long id);
	List<Marque> findByOrderByNomMarqueAsc();
	List<Marque> trierMarquesNomsPrix();
	List<Pays> getAllPays();





}
