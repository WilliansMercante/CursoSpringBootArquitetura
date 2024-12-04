package io.github.williansmercante.cursospringbootarquitetura.montadora.configuration;

import io.github.williansmercante.cursospringbootarquitetura.montadora.Motor;
import io.github.williansmercante.cursospringbootarquitetura.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {
    //@Primary
    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(0);
        motor.setLitragem(0.0);
        motor.setModelo("DOLPHIN");
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(500);
        motor.setCilindros(6);
        motor.setLitragem(3.0);
        motor.setModelo("TURBO SPORT");
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

}
