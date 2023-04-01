package br.com.fiap.hackaton.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @Test
    void ok() {
        HomeController controller = new HomeController();
        String response = controller.ok().getBody();
        assertEquals("Ok",response);
    }
}