package org.example;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap input = new HashMap();
        input.put("PARAM1", "A");

        new HashMapExample().methodThatReturnAHashMap(input);
        HashMap param = new HashMap();
        param.put("NR_ATENDIMENTO_P", 123);
        new HashMapExample().executaGravarPrescricaoCase(param);

        System.out.println("Hello world!");
    }
}