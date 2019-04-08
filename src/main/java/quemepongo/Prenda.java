package quemepongo;

import quemepongo.enumerados.Material;
import quemepongo.enumerados.TipoDePrenda;
import quemepongo.enumerados.Trama;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipo;
    private Material material;
    private Trama trama;
    private Color primario;
    private Color secundario;

    public Prenda(TipoDePrenda tipo, Material material, Trama trama, Color primario, Color secundario) {
        this.tipo = tipo;
        this.material = material;
        this.trama = trama;
        this.primario = primario;
        this.secundario = secundario;
    }
}
