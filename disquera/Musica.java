package disquera;

public class Musica {
    // colocamos los atributos necesarios. Todos los atributos serán privados

    private String nombre, artista, Genero;
    private int VisitasStreaming;
    private double Regalias;
    // definimos contructores por defecto

    public Musica() {
        // vamos a proceder a inicializar los calores por defecto. los string se ponene
        // con comillas vacias y los numero inicializados a 0
        nombre = "";
        artista = "";
        Genero = "";

        Regalias = 0;
        VisitasStreaming = 0;
        // si es booleano se pone true

    }// cierre public musica

    public Musica(String nombre, double Regalias, int VisitasStreaming, String artista, String Genero) { // se pone cada
                                                                                                         // parametro
                                                                                                         // dentro de
                                                                                                         // los
                                                                                                         // parentesis
                                                                                                         // de la clase.

        // usamos los punteros "this" para indicar el atributo de mi clase
        this.nombre = nombre;
        this.Regalias = Regalias;
        this.VisitasStreaming = VisitasStreaming;
        this.artista = artista;
        this.Genero = Genero;

    }

    // creamos los getters para poder imprimir y llamar a nuestro metodo privado.

    public String getNombre() {
        return nombre;
    }

    public double getRegalias() {
        return Regalias;
    }

    public int getVisitasStreaming() {
        return VisitasStreaming;
    }

    public String getGenero() {
        return Genero;
    }

    public String getArtista() {
        return artista;
    }

    // setter es lo mismo que con el getter pero sirve para asignarle un valor a un
    // metodo privado.

    public void setVisitasStreaming(int VisitasStreaming) {
        this.VisitasStreaming = VisitasStreaming;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setRegalias(int Regalias) {
        this.Regalias = Regalias;
    }

}// cierre main