public enum TipoDePedicura {

    PREMIUM(" Estandar + Masaje con piedras"), ESTANDAR("Unias normales");

    private String tipoDePedicura;

    TipoDePedicura(String tipoDeUnia) {
        this.tipoDePedicura = tipoDeUnia;
    }

    public String getTipoDeUnia() {
        return tipoDePedicura;
    }
}
