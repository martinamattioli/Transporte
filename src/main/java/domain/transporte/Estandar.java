package domain.transporte;

public class Estandar implements StrategyEnvio{
    private Integer tarifaDeEnvioLocal;
    private Integer tarifaDeEnvioADistancia;

    @Override
    public Integer calcularCosto(TipoDeEnvio tipoDeEnvio,Paquete paquete){
        return paquete.getPeso()*this.costoPorTipoDeEnvio(tipoDeEnvio);
    }

    public Integer costoPorTipoDeEnvio(TipoDeEnvio tipoDeEnvio){
        if(tipoDeEnvio == TipoDeEnvio.LARGADISTANCIA)
            return tarifaDeEnvioADistancia;
        else return tarifaDeEnvioLocal;
    }
}
