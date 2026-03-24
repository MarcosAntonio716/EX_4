package com.example.Base.controller;

import com.example.Base.entity.Autor;
import com.example.Base.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @PostMapping
    public Autor salvar(@RequestBody Autor autor) {
        return service.salvar(autor);
    }

    @GetMapping
    public List<Autor> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Autor> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}