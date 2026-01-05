package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.util.DataConverterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DataConverterImpl dataConverter = new DataConverterImpl();
		ConsumoAPI consumoAPI = new ConsumoAPI();
		System.out.println("Data obtenida: "+dataConverter.getData(consumoAPI.obtenerDatos("http://www.omdbapi.com/?t=the+lord+of+the+rings&plot=full&apiKey=7b643dee"), DatosSerie.class));
	}
}
