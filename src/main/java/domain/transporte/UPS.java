package domain.transporte;

public class UPS implements StrategyEnvio{

    @Override
    public double calcularCosto(TipoDeEnvio tipoDeEnvio, Paquete paquete) {
        return paquete.getPeso();
    }

}
