package com.example.MyProject;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.MyProject.Service.MarqueService;
import com.example.MyProject.entities.Marque;

@SpringBootApplication
public class MyProjectApplication implements CommandLineRunner  {
	@Autowired
	MarqueService marqueService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	//	marqueService.saveMarque(new Marque(" Dell", 2600.0, new Date(),"aa","aa"));
		// marqueService.saveMarque(new Marque(" Asus", 2800.0, new Date(),"aa","aa"));
	//	marqueService.saveMarque(new Marque(" Epson", 900.0, new Date(),"aa","aa"));
		repositoryRestConfiguration.exposeIdsFor(Marque.class);
}
}