package io.github.williansmercante.cursospringbootarquitetura.montadora.api;

import io.github.williansmercante.cursospringbootarquitetura.montadora.CarroStatus;
import io.github.williansmercante.cursospringbootarquitetura.montadora.Chave;
import io.github.williansmercante.cursospringbootarquitetura.montadora.HondaHRV;
import io.github.williansmercante.cursospringbootarquitetura.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {

        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }
}