package com.example.MyProject.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.Service.MarqueService;
import com.example.MyProject.entities.Marque;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MarqueRESTController {
    @Autowired
    MarqueService marqueService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Marque> getAllMarques() {
        return marqueService.getAllMarque();
    }
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Marque getMarqueById(@PathVariable("id") Long id) {
        return marqueService.getMarque(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Marque createMarque(@RequestBody Marque marque) {
    return marqueService.saveMarque(marque);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Marque updateMarque(@RequestBody Marque marque) {
    return marqueService.updateMarque(marque);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteMarque(@PathVariable("id") Long id)
    {
    marqueService.deleteMarqueById(id);
    }
    @RequestMapping(value="/marquespays/{idPays}",method = RequestMethod.GET)
    public List<Marque> getMarquesByPaysId(@PathVariable("idPays") Long idPays) {
        List<Marque> marques = marqueService.findByPaysIdPays(idPays);
        if(marques.isEmpty()) {
            System.out.println("Aucune marque trouvée pour l'ID de pays donné.");
        }
        return marques;
    }

}
