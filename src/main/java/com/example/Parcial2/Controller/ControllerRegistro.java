/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Parcial2.Controller;

import com.example.Parcial2.Model.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aaron
 */

@Controller
public class ControllerRegistro {
     @GetMapping("/registrarse")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("registro", new Registro()); // Crear un objeto vacío de Registro
        return "registrarse"; // Muestra el formulario de registro
    }

    @PostMapping("/enviarRegistro")
    public String enviarRegistro(@ModelAttribute Registro registro, Model model) {
        // Aquí puedes guardar los datos en la base de datos si lo deseas
        model.addAttribute("registro", registro); // Pasamos el objeto Registro al modelo

        return "exito"; // Redirige a la página de éxito
    }
}
