
public class Main {
    public static void main(String[] args) {
        Figure[] figuras = new Figure[150];
        int index = -1;
        double somaAreas = 0;

        for (int i = 1; i <= 50; i++) {
            figuras[++index] = new Circle(0, 0, i);
            somaAreas += figuras[index].area();

            figuras[++index] = new Rectangle(0, 0, i, i);
            somaAreas += figuras[index].area();

            figuras[++index] = new Triangle(0, 0, i, i, i);
            somaAreas += figuras[index].area();
        }

        System.out.printf("Soma total das áreas: %.2f\n", somaAreas);
    }
}