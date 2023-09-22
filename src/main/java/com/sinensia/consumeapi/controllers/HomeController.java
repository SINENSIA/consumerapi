package com.sinensia.consumeapi.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sinensia.consumeapi.models.Puerto;
import com.sinensia.consumeapi.services.ApiService;

/**
 * Controlador de la página principal.
 */
@Controller
public class HomeController {
    private final ApiService apiService;

    public HomeController(ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Muestra la página principal con los puertos.
     *
     * @param model Modelo de la vista.
     * @return Nombre de la vista.
     */
    @GetMapping("/index")
    public String mostrarPuertos(Model model) {
        List<Puerto> puertos = apiService.obtenerPuertos();
        model.addAttribute("puertos", puertos);
        return "index";
    }
}
