package domain.transporte;

public class FedEx implements StrategyEnvio{

    @Override
    public Integer calcularCosto(TipoDeEnvio tipoDeEnvio,Paquete paquete) {
        return paquete.getPeso();
    }

}
