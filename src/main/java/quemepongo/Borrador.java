package quemepongo;

import quemepongo.enumerados.Material;
import quemepongo.enumerados.TipoDePrenda;
import quemepongo.enumerados.Trama;
import quemepongo.excepciones.MaterialNoValidoParaElTipoDePrenda;

import static java.util.Objects.requireNonNull;

public class Borrador {

    private Material material;
    private Color primario;
    private Color secundario;
    private Trama trama = Trama.LISA;
    private TipoDePrenda tipo;

    public void definirTipo(TipoDePrenda tipo) {
        this.tipo = requireNonNull(tipo);
    }

    public void definirMaterial(Material material) {
        this.material = requireNonNull(material);
    }

    public void definirColorPrimario(Color primario) {
        this.primario = requireNonNull(primario);
    }

    public void definirColorSecundario(Color secundario) {
        this.secundario = requireNonNull(secundario);
    }

    public void definirTrama(Trama trama) {
        this.trama = requireNonNull(trama);
    }

    public Prenda crearPrenda() throws Exception {
        if(!tipo.permiteMaterial(material))
            throw new MaterialNoValidoParaElTipoDePrenda();
        return new Prenda(tipo,material,trama,primario,secundario);
    }
}
