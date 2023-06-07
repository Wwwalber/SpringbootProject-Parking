package com.api.parking_control_nb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //para testar sem criar um source de controler ainda
public class ParkingControlNbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlNbApplication.class, args);
	}

        @GetMapping("/")
        public String index(){
            return "Olá Mundo!";
        }
}
