package com.example.MyProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.MyProject.Repos.MarqueRepisotery;
import com.example.MyProject.Service.MarqueService;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.MyProject.entities.Marque;
import com.example.MyProject.entities.Pays;
@SpringBootTest
class MyProjectApplicationTests {
	@Autowired
	private MarqueRepisotery marqueRepository;
	@Autowired
	private MarqueService marqueService;
	/*@Test
	public void testCreateMarque() {
	Marque mar = new Marque("adidas",2200.500,new Date(),"sport","la marque la plus confort");
	marqueRepository.save(mar);
	}
	@Test
	public void testFindMarque()
	{
		Marque mar = marqueRepository.findById(1L).get(); 
	System.out.println(mar);
	}
	@Test
	public void testUpdateMarque()
	{
		Marque mar = marqueRepository.findById(1L).get();
		mar.setChiffreaffaire(1000.0);
		marqueRepository.save(mar);
	}
	@Test
	public void testDeleteMarque()
	{
		marqueRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousMarque()
	{
	List<Marque> mar =  marqueRepository.findAll();
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testFindByNomMarqueContains()
	{
	Page<Marque> mar = marqueService.getAllMarquesParPage(0,2);
	System.out.println(mar.getSize());
	System.out.println(mar.getTotalElements());
	System.out.println(mar.getTotalPages());
	mar.getContent().forEach(m -> {System.out.println(m.toString());
	 });
	
	
}
	@Test
	public void testFindMarqueByNom()
	{
	List<Marque> mar = marqueRepository.findByNomMarque("nike"); 
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testFindMarqueByNomContains()
	{
	List<Marque> mar = marqueRepository.findByNomMarqueContains("n"); 
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testFindByNomMarquePrix() {
	    List<Marque> marques = marqueRepository.findByNomChiffreAffaire("Nike", 2200.5);
	    for (Marque m : marques) {
	        System.out.println(m);
	    }
	}
	*/
	
	
	
	/*@Test
	public void testFindByPays() {
	    Pays pays = new Pays();
	    pays.setIdPays(2L);

	    List<Marque> marques = marqueRepository.findByPays(pays);
	    for (Marque m : marques) {
	        System.out.println(m);
	    }
	}
	*/
	/*@Test
	public void findByPaysIdPays()
	{
	List<Marque> mar = marqueRepository.findByPaysIdPays(2L);
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	 }*/
	
	/*@Test
	public void testfindByOrderByNomMarqueAsc()
	{
	List<Marque> mar = marqueRepository.findByOrderByNomMarqueAsc();
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	}
*/
	
	@Test
	public void testTrierMarquesNomsPrix()
	{
	List<Marque> mar =marqueRepository.trierMarquesNomsPrix();
	for (Marque m : mar)
	{
	System.out.println(m);
	}
	}
	
	
	
	
	
	
	
	
	
	
	}
	
