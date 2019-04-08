package quemepongo.enumerados;

import java.util.EnumSet;

public enum TipoDePrenda {
    REMERA{

        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.POLIESTER);

        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }

        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    PANTALON{

        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.PARTE_INFERIOR;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    POLLERA{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.PARTE_INFERIOR;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    CAMISA_MANGA_CORTA{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    BLUSA{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    ZAPATOS{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.CALZADO;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    ZAPATILLA{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.CALZADO;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    },
    GORRA{
        private EnumSet<Material> materiales = EnumSet.of(Material.ALGODON, Material.JEAN);

        @Override
        public Categoria categoria() {
            return Categoria.ACCESORIOS;
        }
        @Override
        public Boolean permiteMaterial(Material material) {
            return materiales.contains(material);
        }
    };

    public abstract Categoria categoria();
    public abstract Boolean permiteMaterial(Material material);
}
