
package com.literalura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.literalura.service.MenuService;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    private final MenuService menu;

    public LiteraluraApplication(MenuService menu){
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        menu.exibirMenu();
    }
}
