package domain.transporte;

public interface StrategyEnvio {
    double calcularCosto(TipoDeEnvio tipoDeEnvio, Paquete paquete);

}
