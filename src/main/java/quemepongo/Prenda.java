package quemepongo;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipo;
    private Material material;
    private Color color;

    public Prenda(TipoDePrenda tipo, Material material, Color color)  {
        this.tipo = requireNonNull(tipo, "tipo de prenda es obligatorio");
        this.material = requireNonNull(material,"material de prenda es obligatorio");
        this.color = requireNonNull(color,"color de prenda es obligatorio");
    }
}
