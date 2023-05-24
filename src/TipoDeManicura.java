public enum TipoDeManicura {
    GEL ("Unias de Gel"), ESCULPIDA ("Unias ESCULPIDAS");

    private String tipoDeManicura;

    TipoDeManicura(String tipoDeUnia) {
        this.tipoDeManicura = tipoDeUnia;
    }

    public String getTipoDeUnia() {
        return tipoDeManicura;
    }
}
