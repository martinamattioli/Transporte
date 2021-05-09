package domain.transporte;

public class Envio {
    private StrategyEnvio estrategia;
    private Paquete paquete;
    private TipoDeEnvio tipoDeEnvio;

    public Envio(StrategyEnvio estrategia, Paquete paquete, TipoDeEnvio tipoDeEnvio){
        this.estrategia = estrategia;
        this.paquete = paquete;
        this.tipoDeEnvio = tipoDeEnvio;
    }

    public TipoDeEnvio getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public double calcularCosto(){
        return this.estrategia.calcularCosto(this.tipoDeEnvio, this.paquete);
    }
}
