public class Main {
    public static void main(String[] args) {
        
      ArrayList<Shape> formas = new ArrayList<Shape>()
      formas.add(new Circle())
      formas.add(new Triangle())

        formas.forEach((forma) -> forma.draw()); 
        
    }
}