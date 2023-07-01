package com.buddycoach.usermanagerservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
/**
 * Controlador de prueba para verificar la conexión entre el frontend y el backend.
 * Esta clase utiliza la anotación @RestController para indicar que es un controlador REST.
 * Los métodos del controlador se encargan de manejar las solicitudes HTTP y retornan directamente datos en formato de datos (como JSON) que se enviarán al cliente, en lugar de renderizar vistas.
 */

//
@RestController
public class MessagesController {

    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("first", "second"));
    }
}