public enum TipoDeUnia {
    GEL ("Unias de Gel"), ESCULPIDA ("Unias ESCULPIDAS");
    private String tipoDeUnia;

    TipoDeUnia(String tipoDeUnia) {
        this.tipoDeUnia = tipoDeUnia;
    }

    public String getTipoDeUnia() {
        return tipoDeUnia;
    }
}
