package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {
    private final LoginService service = new LoginService();

    @Test
    void aceitaSenhaValida() {
        assertTrue(service.senhaValida("12345678"));
    }

    @Test
    void rejeitaSenhaCurta() {
        assertFalse(service.senhaValida("123"));
    }

    @Test
    void rejeitaSenhaNula() {
        assertFalse(service.senhaValida(null));
    }
}