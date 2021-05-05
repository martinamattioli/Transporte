package domain.transporte;

public class UPS implements StrategyEnvio{

    @Override
    public Integer calcularCosto(TipoDeEnvio tipoDeEnvio,Paquete paquete) {
        return paquete.getPeso();
    }

}
