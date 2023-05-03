package com.example.MyProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.MyProject.Repos.MarqueRepisotery;
import com.example.MyProject.Repos.paysRepisotery;
import com.example.MyProject.entities.Marque;
import com.example.MyProject.entities.Pays;

@Service
public class MarqueServiceImp implements MarqueService{
	@Autowired
MarqueRepisotery marqueRepository;
	@Autowired
	private paysRepisotery paysRepository;

	@Override
	public Marque saveMarque(Marque m) {
		
		return marqueRepository.save(m) ;
	}

	@Override
	public Marque updateMarque(Marque m) {
		
		 return marqueRepository.save(m) ;
	}

	@Override
	public void deleteMarque(Marque m) {
	 marqueRepository.delete(m) ;
		
	}

	@Override
	public void deleteMarqueById(Long id) {
		marqueRepository.deleteById(id) ;
	}

	@Override
	public Marque getMarque(Long id) {
	
	return	marqueRepository.findById(id).get() ;
	}

	@Override
	public List<Marque> getAllMarque() {
		// TODO Auto-generated method stub
		 return	marqueRepository.findAll();
	}

	@Override
	public Page<Marque> getAllMarquesParPage(int page, int size) {
		return marqueRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Marque> findByNomMarque(String nom) {
		
		return marqueRepository.findByNomMarque(nom);
	}

	@Override
	public List<Marque> findByNomMarqueContains(String nom) {
	
		return marqueRepository.findByNomMarqueContains(nom);
	}

	@Override
	public List<Marque> findByNomChiffreAffaire(String nom, Double chiffreAffaire) {
		 		return marqueRepository.findByNomChiffreAffaire(nom, chiffreAffaire);

	}

	@Override
	public List<Marque> findByPays(Pays pays) {
		return marqueRepository.findByPays(pays);

	}

	@Override
	public List<Marque> findByPaysIdPays(Long id) {
		return marqueRepository.findByPaysIdPays(id);
	}

	@Override
	public List<Marque> findByOrderByNomMarqueAsc() {
		
		return findByOrderByNomMarqueAsc();
	}

	@Override
	public List<Marque> trierMarquesNomsPrix() {
		return trierMarquesNomsPrix() ;
	}


	@Override
	public List<Pays> getAllPays() {
	    return paysRepository.findAll();
	}


}
