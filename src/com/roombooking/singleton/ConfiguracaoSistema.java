package com.roombooking.singleton;

// Commit 9 - Graziele
// Singleton thread-safe para configurações do sistema
public class ConfiguracaoSistema {

    private String nomeCampus;
    private int duracaoMinimaReservaMinutos;
    private int duracaoMaximaReservaMinutos;

    private ConfiguracaoSistema() {
        this.nomeCampus = "Campus Universitário";
        this.duracaoMinimaReservaMinutos = 30;
        this.duracaoMaximaReservaMinutos = 240;
    }

    private static class Holder {
        private static final ConfiguracaoSistema INSTANCE = new ConfiguracaoSistema();
    }

    public static ConfiguracaoSistema getInstance() {
        return Holder.INSTANCE;
    }

    public String getNomeCampus() { return nomeCampus; }
    public void setNomeCampus(String nomeCampus) { this.nomeCampus = nomeCampus; }

    public int getDuracaoMinimaReservaMinutos() { return duracaoMinimaReservaMinutos; }
    public void setDuracaoMinimaReservaMinutos(int min) { this.duracaoMinimaReservaMinutos = min; }

    public int getDuracaoMaximaReservaMinutos() { return duracaoMaximaReservaMinutos; }
    public void setDuracaoMaximaReservaMinutos(int max) { this.duracaoMaximaReservaMinutos = max; }
}