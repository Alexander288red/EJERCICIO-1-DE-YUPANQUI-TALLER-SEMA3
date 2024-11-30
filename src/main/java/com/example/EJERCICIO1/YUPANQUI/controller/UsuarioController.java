/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO1.YUPANQUI.controller;

import com.example.EJERCICIO1.YUPANQUI.model.Usuario; // Asegúrate de que la clase Usuario esté en este paquete
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador que maneja las solicitudes de la vista de usuario
 * 
 * @author Usuario
 */
@Controller
public class UsuarioController {

    // Muestra el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario()); // Creamos un objeto Usuario vacío para el formulario
        return "formulario"; // Devuelve la vista formulario.html
    }

    // Procesa el formulario y redirige a otra página
    @PostMapping("/guardar")
    public String guardarFormulario(Usuario usuario, Model model) {
        // Aquí podrías guardar el usuario en la base de datos, etc.
        model.addAttribute("usuario", usuario); // Pasamos los datos del usuario al modelo para mostrarlos

        // Redirige a la vista donde se mostrará el usuario guardado
        return "resultado"; // Redirige a resultado.html
    }
}