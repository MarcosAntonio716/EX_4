package com.example.Base.service;

import com.example.Base.entity.Autor;
import com.example.Base.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    // Criar autor
    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }

    // Listar todos
    public List<Autor> listarTodos() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Autor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar por ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}