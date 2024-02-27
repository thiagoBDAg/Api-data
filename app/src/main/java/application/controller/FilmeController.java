package application.controller;
import java.util.List;

import application.repository.FilmeRepository;
import application.model.Filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {
    @Autowired
    FilmeRepository filmeRepo;

    @GetMapping("/filme")
    public List<Filme> listarFilmes(){
        return filmeRepo.findAll();
    }
}
