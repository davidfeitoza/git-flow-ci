package org.example;

public class LoginService {
    public boolean senhaValida(String senha) {
        return senha != null && senha.length() >= 8;
    }
}