package org.example;

import java.util.regex.Pattern;

public class NotificacaoService {
    private static final Pattern EMAIL = Pattern.compile(
            "^[A-Za-z0-9._%+-]+(?:\\.[A-Za-z0-9._%+-]+)*"
                    + "@[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)*"
                    + "(?:\\.[A-Za-z]{2,})?$"
    );

    public boolean enviarEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email nulo");
        }

        if (!EMAIL.matcher(email).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }

        return true;
    }
}
