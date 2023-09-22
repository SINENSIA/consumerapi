package com.sinensia.consumeapi.models;

import java.util.Objects;

/**
 * Puerto
 */
public class Puerto {
    private String id;
    private String code;
    private String nombrePuerto;
    private String lat;
    private String lon;

    // getters y setters

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Puerto)) {
            return false;
        }
        Puerto puertoObject = (Puerto) o;
        return Objects.equals(id, puertoObject.id) && Objects.equals(code, puertoObject.code)
                && Objects.equals(this.nombrePuerto, puertoObject.nombrePuerto)
                && Objects.equals(this.lat, puertoObject.lat)
                && Objects.equals(this.lon, puertoObject.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nombrePuerto, lat, lon);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombrePuerto() {
        return this.nombrePuerto;
    }

    public void setPuerto(String puerto) {
        this.nombrePuerto = puerto;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return this.lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "{"
                + " id='"
                + getId()
                + "'"
                + ", code='"
                + getCode()
                + "'"
                + ", puerto='"
                + getNombrePuerto() + "'"
                + ", lat='" + getLat()
                + "'"
                + ", lon='"
                + getLon()
                + "'" +
                "}";
    }

}
