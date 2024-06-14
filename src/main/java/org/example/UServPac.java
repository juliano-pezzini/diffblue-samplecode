package org.example;

public class UServPac {
    public static boolean isNull(Object valor) {
        return valor == null || "".equals(valor.toString()) || "null".equals(valor);
    }
}
