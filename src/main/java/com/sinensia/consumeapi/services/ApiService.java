package com.sinensia.consumeapi.services;

import com.sinensia.consumeapi.models.ApiResponse;
import com.sinensia.consumeapi.models.Puerto;
import java.util.Collections;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Hace una llamada a la API y devuelve una lista de puertos.
 * 
 */
@Service
public class ApiService {

    private static final String API_URL = "https://ideihm.covam.es/api-ihm/getmarea?REQUEST=getlist&format=json";

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Método que usa RestTemplate para obtener los datos de la API.
     * 
     */
    public List<Puerto> obtenerPuertos() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ApiResponse respuesta = restTemplate.exchange(
                API_URL,
                HttpMethod.GET,
                entity,
                ApiResponse.class).getBody();
        String copyright = respuesta.getEstaciones().getCopyright();
        List<Puerto> puertos = respuesta.getEstaciones().getPuertos();

        // Para acceder a la información de un puerto específico:
        Puerto primerPuerto = puertos.get(0);
        String nombrePrimerPuerto = primerPuerto.getNombrePuerto();

        System.out.println("Nombre del primer puerto: " + nombrePrimerPuerto);
        return puertos;
    }
}
