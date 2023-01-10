package io.github.felipelabs.fastfood.controller;

import io.github.felipelabs.fastfood.model.Sanduiche;
import io.github.felipelabs.fastfood.repository.SanduicheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanduiche")
public class SanduicheController {
    @Autowired
    private SanduicheRepository sanduicheRepository;
    @GetMapping
    public List<Sanduiche> listarSanduiche() {
        return sanduicheRepository.findAll();
    }
    @PostMapping
    public void adicionarSanduiche(@RequestBody Sanduiche sanduiche){
        sanduicheRepository.save(sanduiche);
    }
    @PutMapping
    public Sanduiche alterarSanduiche(@RequestBody Sanduiche sanduiche){
        if(sanduiche.getId().equals(0)){
           return null;
        } else {
            return sanduicheRepository.save(sanduiche);
        }
    }
    @DeleteMapping
    public void deletarSanduiche(@RequestBody Sanduiche sanduiche){
        try {
            sanduicheRepository.deleteById(sanduiche.getId());
        }catch (Exception e){
            System.out.println("Erro ao excluir o sanduiche!!");
        }
    }

}
