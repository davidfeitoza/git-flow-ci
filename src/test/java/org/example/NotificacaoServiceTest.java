package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificacaoServiceTest {
    private final NotificacaoService service = new NotificacaoService();

    @Test
    void aceitaEmailValido(){
        assertTrue(service.enviarEmail("ana@example.com"));
    }

    @Test
    void rejeitaEmailInvalido(){
        assertThrows(
                IllegalArgumentException.class,
                () -> service.enviarEmail("email-invalido")
        );
    }

    @Test
    void rejeitaEmailNulo(){
        assertThrows(
                IllegalArgumentException.class,
                () -> service.enviarEmail(null)
        );
    }
}