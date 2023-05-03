package com.example.MyProject.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MyProject.Service.MarqueService;
import com.example.MyProject.entities.Marque;
import com.example.MyProject.entities.Pays;

@Controller
public class MarqueController {
	@Autowired
	MarqueService marqueService;
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap) {
	    List<Pays> paysList = marqueService.getAllPays();
	    Marque marque = new Marque();
	    
	       
	
	    
	    modelMap.addAttribute("marque", marque);
	    modelMap.addAttribute("mode", "new");
	    modelMap.addAttribute("paysList", paysList);
	    return "formMarque";
	}

	@RequestMapping("/saveMarque")
	public String saveMarque(@Validated Marque marque, BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) return "formMarque";

	marqueService.saveMarque(marque);
	
	return "formMarque";
	}
	
	@RequestMapping("/ListeMarques")
	public String listeMarques(ModelMap modelMap,
	                           @RequestParam(name="page", defaultValue="0") int page,
	                           @RequestParam(name="size", defaultValue="2") int size) {
	    Page<Marque> marques = marqueService.getAllMarquesParPage(page, size);
	    modelMap.addAttribute("marques", marques);
	    modelMap.addAttribute("pages", new int[marques.getTotalPages()]);
	    modelMap.addAttribute("currentPage", page);
	    return "listeMarques";
	}

	@RequestMapping("/supprimerMarque")
	public String supprimerMarque(@RequestParam("id") Long id,
	    ModelMap modelMap,
	    @RequestParam(name="page", defaultValue="0") int page,
	    @RequestParam(name="size", defaultValue="2") int size)
	{ 
	    marqueService.deleteMarqueById(id);
	    Page<Marque> marques = marqueService.getAllMarquesParPage(page, size);
	    modelMap.addAttribute("marques", marques);
	    modelMap.addAttribute("pages", new int[marques.getTotalPages()]);
	    modelMap.addAttribute("currentPage", page);
	    modelMap.addAttribute("size", size);
	    return "listeMarques";
	}

	@RequestMapping("/modifierMarque")
	public String editerMarque(@RequestParam("id") Long id, ModelMap modelMap) {
		Marque marque = marqueService.getMarque(id);
		modelMap.addAttribute("marque", marque);
		modelMap.addAttribute("mode", "edit");
		return "formMarque";
	}

	@RequestMapping("/updateMarque")
	public String updateMarque(@ModelAttribute("marque") Marque marque, @RequestParam("date") String date,
			ModelMap modelMap) throws ParseException {
		// conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateValidation = dateformat.parse(date);
		marque.setDateValidation(dateValidation);

		marqueService.updateMarque(marque);
		List<Marque> marques = marqueService.getAllMarque();
		modelMap.addAttribute("marques", marques);
		return "listeMarques";
	}


	}



