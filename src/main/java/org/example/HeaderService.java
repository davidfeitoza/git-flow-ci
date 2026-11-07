package org.example;

public class HeaderService {
    public String normalizar(String header) {
        if (header == null) {
            return "";
        }
        return header.trim();
    }
}