package domain.transporte;

public class Estandar implements StrategyEnvio{
    private double tarifaDeEnvioLocal;
    private double tarifaDeEnvioADistancia;

    public Estandar(double tarifaDeEnvioLocal,double tarifaDeEnvioADistancia){
        this.tarifaDeEnvioLocal = tarifaDeEnvioLocal;
        this.tarifaDeEnvioADistancia = tarifaDeEnvioADistancia;
    }

    @Override
    public double calcularCosto(TipoDeEnvio tipoDeEnvio, Paquete paquete){
        return paquete.getPeso()*this.costoPorTipoDeEnvio(tipoDeEnvio);
    }

    public double costoPorTipoDeEnvio(TipoDeEnvio tipoDeEnvio){
        if(tipoDeEnvio == TipoDeEnvio.LARGADISTANCIA)
            return tarifaDeEnvioADistancia;
        else return tarifaDeEnvioLocal;
    }
}
