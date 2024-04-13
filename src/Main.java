public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido(a) a Screen Match");
        String pelicula = "Matrix";
        System.out.println("Película: " + pelicula);

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                %s es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: %d """.formatted(pelicula, fechaDeLanzamiento);
        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.println("⭐ " + clasificacion);
    }
}