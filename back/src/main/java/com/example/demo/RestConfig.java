package com.example.demo;



import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class RestConfig {

    @GetMapping("/datos")
    public ResponseEntity<Map<String, String>> obtenerDatos() {
        // Lógica para obtener datos
        Map<String, String> response = new HashMap<>();
        response.put("datos", "Datos desde las nalguitas de valendiosi");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/enviar-datos")
    public ResponseEntity<Map<String, String>> enviarDatos(@RequestBody Map<String, String> datos) {
        // Lógica para procesar datos recibidos
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Datos recibidos y procesados en el servidor");
        return ResponseEntity.ok(response);
    }

}
