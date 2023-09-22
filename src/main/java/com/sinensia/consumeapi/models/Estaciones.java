package com.sinensia.consumeapi.models;

import java.util.List;

/**
 * Clase que representa la respuesta de la API con estaciones.
 */
public class Estaciones {
    private String copyright;
    private List<Puerto> puertos;

    // Getters y setters

    public String getCopyright() {
        return this.copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public List<Puerto> getPuertos() {
        return this.puertos;
    }

    public void setPuertos(List<Puerto> puertos) {
        this.puertos = puertos;
    }

}
