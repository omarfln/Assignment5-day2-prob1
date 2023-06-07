// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figure [] figureObj = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
        for (Figure f : figureObj){
            f.getFigure();
        }

        System.out.println();
        System.out.println();

        for (Figure f : figureObj){
            System.out.print(f.getClass().getSimpleName() + ": ");
            f.getFigure();
            System.out.println();
        }
    }
}