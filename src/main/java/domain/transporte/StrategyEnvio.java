package domain.transporte;

public interface StrategyEnvio {
    public Integer calcularCosto(TipoDeEnvio tipoDeEnvio,Paquete paquete);

}
