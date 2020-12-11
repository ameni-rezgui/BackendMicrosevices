package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="C1", types= Commande.class )

public interface CommandeProjection {
	public Double getMontant();

}
