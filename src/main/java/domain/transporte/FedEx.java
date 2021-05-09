package domain.transporte;

public class FedEx implements StrategyEnvio{

    @Override
    public double calcularCosto(TipoDeEnvio tipoDeEnvio, Paquete paquete) {
        return paquete.getPeso();
    }

}
