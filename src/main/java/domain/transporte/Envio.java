package domain.transporte;

public class Envio {
    private StrategyEnvio estrategia;
    private Paquete paquete;
    private TipoDeEnvio tipoDeEnvio;

    public TipoDeEnvio getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public Integer calcularCosto(){
        return this.estrategia.calcularCosto(this.tipoDeEnvio, this.paquete);
    }
}
