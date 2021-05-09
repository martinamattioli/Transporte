import domain.transporte.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTransportista {
    static Envio envio;
    static Paquete paquete;
    static TipoDeEnvio tipoDeEnvio;
    static Estandar envioEstandar;
    static FedEx envioFedEx;
    static UPS envioUPS;
    static StrategyEnvio estragiaDeEnvio;

    @BeforeClass
    public static void init(){
        paquete = new Paquete(10);
        envioFedEx = new FedEx();
        envioUPS = new UPS();
        envioEstandar = new Estandar(20,50);
    }

    @Test
    public void TestEnvioEstandarLocal(){
        envio = new Envio(envioEstandar, paquete, tipoDeEnvio.LOCAL);
        Assert.assertEquals(200,envio.calcularCosto(),0);
    }

    @Test
    public void TestEnvioEstandarLargaDistancia(){
        envio = new Envio(envioEstandar, paquete, tipoDeEnvio.LARGADISTANCIA);
        Assert.assertEquals(500,envio.calcularCosto(),0);
    }
    @Test
    public void TestEnvioFedEx(){
        envio = new Envio(envioFedEx,paquete,tipoDeEnvio.LOCAL);
        Assert.assertEquals(10,envio.calcularCosto(),0);
    }

    @Test
    public void TestEnvioUPS(){
        envio = new Envio(envioUPS,paquete,tipoDeEnvio.LARGADISTANCIA);
        Assert.assertEquals(10,envio.calcularCosto(),0);
    }
}
