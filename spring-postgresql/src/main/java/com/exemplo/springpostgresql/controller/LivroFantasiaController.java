package com.exemplo.springpostgresql.controller;

import com.exemplo.springpostgresql.model.LivroFantasia;
import com.exemplo.springpostgresql.repository.LivroFantasiaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livrosfantasia")
public class LivroFantasiaController {

    private final LivroFantasiaRepository livroFantasiaRepository;

    public LivroFantasiaController(LivroFantasiaRepository livroFantasiaRepository) {
        this.livroFantasiaRepository = livroFantasiaRepository;
    }

    @GetMapping
    public List<LivroFantasia> listarTodos() {
        return livroFantasiaRepository.findAll();
    }

    @PostMapping
    public LivroFantasia adicionarLivro(@RequestBody LivroFantasia livro) {
        return livroFantasiaRepository.save(livro);
    }
}
