package quemepongo;

public enum TipoDePrenda {
    REMERA{
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
    },
    PANTALON{
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_INFERIOR;
        }
    },
    POLLERA{
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_INFERIOR;
        }
    },
    CAMISA_MANGA_CORTA{
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
    },
    BLUSA{
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
    },
    ZAPATOS{
        @Override
        public Categoria categoria() {
            return Categoria.CALZADO;
        }
    },
    ZAPATILLA{
        @Override
        public Categoria categoria() {
            return Categoria.CALZADO;
        }
    },
    GORRA{
        @Override
        public Categoria categoria() {
            return Categoria.ACCESORIOS;
        }
    };
    public abstract Categoria categoria();
}
