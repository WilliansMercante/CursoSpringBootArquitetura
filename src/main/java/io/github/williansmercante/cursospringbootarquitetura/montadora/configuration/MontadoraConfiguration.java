package io.github.williansmercante.cursospringbootarquitetura.montadora.configuration;

import io.github.williansmercante.cursospringbootarquitetura.montadora.Motor;
import io.github.williansmercante.cursospringbootarquitetura.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

}
