package com.example.MyProject;

import org.springframework.data.rest.core.config.Projection;

import com.example.MyProject.entities.Marque;

@Projection(name = "nomMar", types = {Marque.class })

public interface MarqueProjection {
	public String getNomMarque();
}
