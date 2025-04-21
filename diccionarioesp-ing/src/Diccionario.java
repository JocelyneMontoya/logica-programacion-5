import java.util.*;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("peluche", "plushie");
        diccionario.put("taza", "mug");
        diccionario.put("botella", "bottle");
        diccionario.put("agua", "water");
        diccionario.put("bocina", "speaker");
        diccionario.put("plato", "dish");
        diccionario.put("espejo", "mirror");
        diccionario.put("novio", "boyfriend");
        diccionario.put("cuaderno", "notebook");
        diccionario.put("servilleta", "napkin");
        diccionario.put("preguntar", "ask");
        diccionario.put("llaves", "keys");
        diccionario.put("charlar", "talk");
        diccionario.put("caballo", "horse");
        diccionario.put("entender", "understand");
        diccionario.put("niño", "kid");
        diccionario.put("robar", "steal");
        diccionario.put("con", "with");
        diccionario.put("escribir", "write");
        diccionario.put("amor", "love");

        List<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);
        List<String> seleccionadas = palabras.subList(0, 5);

        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        for (String palabra : seleccionadas) {
            System.out.print("¿Cómo se dice " + palabra + " en inglés?: ");
            String respuesta = scanner.nextLine().toLowerCase().trim();
            String traduccionCorrecta = diccionario.get(palabra).toLowerCase().trim();

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("Correcto :D");
                correctas++;
            } else {
                System.out.println("Incorrecto :c");
                incorrectas++;
            }
        }

        System.out.println("\nResultado final:");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);

        scanner.close();
    }
}