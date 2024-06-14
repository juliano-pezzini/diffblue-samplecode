package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapExample {

    public HashMap methodThatReturnAHashMap(HashMap input) {

        HashMap res = new HashMap();
        res.put("KEY1", "VALUE1");

        if (input.get("PARAM1").equals("A")) {
            res.put("KEY2", "VALUE-A");
        }
        else if (input.get("PARAM1").equals("B")) {
            res.put("KEY2", "VALUE-B");
        }

        return res;
    }

    public HashMap executaGravarPrescricaoCase(HashMap param) {
        HashMap retorno = new HashMap();

        HashMap<String,Object> paramEncounter = new HashMap<>();
        if (UServPac.isNull(param.get(AtePacA8Constants.NR_ATENDIMENTO_P))) {
            paramEncounter.put(AtePacA8Constants.NR_ATENDIMENTO,"");
        } else {
            paramEncounter.put(AtePacA8Constants.NR_ATENDIMENTO,param.get(AtePacA8Constants.NR_ATENDIMENTO_P).toString());
        }

        if (param.get(AtePacA8Constants.NR_ATENDIMENTO_P) != null) {
            if (existePrescricao(paramEncounter)) {
                if (!"".equalsIgnoreCase(param.get("AGENDAS_GERAR_PRESCR") == null ? "" : param.get("AGENDAS_GERAR_PRESCR").toString())) {
                    retorno.put("GEROU_PRESCRICAO_AGENDA", gerarPrescrAgendas(param));
                } else {
                    retorno = gravaPrescricao(param);
                }
            } else {
                retorno.put("GEROU_PRESCRICAO", true);
            }
        }

        //retorno.put("IE_PRIM_ATEND", Funcoes.validaConsultaPadrao(executaConsultaPadrao(230106, paramEncounter)).get("IE_PRIM_ATEND").toString());
        HashMap paramPes = new HashMap();
        paramPes.put("CD_PESSOA_FISICA", param.get("CD_PESSOA_FISICA") == null ? "" : param.get("CD_PESSOA_FISICA").toString());
        //retorno.put("IDADE", Funcoes.validaConsultaPadrao(executaConsultaPadrao(230104, paramPes)).get("IDADE"));
        //retorno.put("QTD_PRESCR", Funcoes.validaConsultaPadrao(executaConsultaPadrao(233548, paramEncounter)).get("QTD_PRESCR"));
        //retorno.put("NR_PRESCRICAO_P", WDAOInjector.consultaPadrao().executaConsultaCampo(831495, paramEncounter, true));
        //retorno.put("DT_PRESCRICAO_P", WDAOInjector.consultaPadrao().executaConsultaCampo(897421, paramEncounter, true));
        //retorno.put("CD_SETOR_ENTREGA_PRESCRICAO_P", WDAOInjector.consultaPadrao().executaConsultaCampo(897538, paramEncounter, true));
        return retorno;
    }

    private ArrayList<HashMap> executaConsultaPadrao(Object i, HashMap<String, Object> paramEncounter) {
        return null;
    }

    private HashMap gravaPrescricao(HashMap param) {
        return (HashMap) param.clone();
    }

    private String gerarPrescrAgendas(HashMap param) {
        return param.get("PARAM1").equals("S") ? "1" : "2";
    }

    private boolean existePrescricao(HashMap<String, Object> paramEncounter) {
        return paramEncounter.get("PARAM1").equals("S");
    }

    private class AtePacA8Constants {
        public static final String NR_ATENDIMENTO_P = "NR_ATENDIMENTO_P";
        public static final String NR_ATENDIMENTO = "NR_ATENDIMENTO";
    }

    public static class Funcoes {
        public static <E> List validaConsultaPadrao(ArrayList<HashMap> hashMaps) {
            return null;
        }
    }

    public static class WDAOInjector {
        public static String consultaPadrao() {
            return null;
        }
    }
}
