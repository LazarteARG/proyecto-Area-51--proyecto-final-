
package modelo;

/*Hecho por Ariel Lazarte**/

public class Categoria {
    private int idCategoria;
    private String tipoDeCamas;
    private int cantidadPersonas;
    private int cantidadCamas;
    private double precioNoche;

    public Categoria() {
    }

    public Categoria(int idCategoria, String tipoDeCamas, int cantidadPersonas, int cantidadCamas,double precioNoche) {
        this.idCategoria = idCategoria;
        this.tipoDeCamas = tipoDeCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.precioNoche=precioNoche;
    }

    public Categoria(String tipoDeCamas, int cantidadPersonas, int cantidadCamas,double precioNoche) {
        this.tipoDeCamas = tipoDeCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.precioNoche=precioNoche;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

        public int getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }

        public String getTipoDeCamas() {
            return tipoDeCamas;
        }

        public void setTipoDeCamas(String tipoDeCamas) {
            this.tipoDeCamas = tipoDeCamas;
        }

        public int getCantidadPersonas() {
            return cantidadPersonas;
        }

        public void setCantidadPersonas(int cantidadPersonas) {
            this.cantidadPersonas = cantidadPersonas;
        }

        public int getCantidadCamas() {
            return cantidadCamas;
        }

        public void setCantidadCamas(int cantidadCamas) {
            this.cantidadCamas = cantidadCamas;
        }

        @Override
        public String toString() {
            return "Categoria{" + "idCategoria=" + idCategoria + ", tipoDeCamas=" + tipoDeCamas + ", cantidadPersonas=" + cantidadPersonas + ", cantidadCamas=" + cantidadCamas + '}';
        }
    
    
}

