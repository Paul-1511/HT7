//Autor: Pablo Méndez 23975
package uvg.edu.gt;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Crear un nuevo árbol binario
        BinaryTree<Association<String, String>> dictionary = new BinaryTree<>(new Association<>("house", "casa"));

        // Insertar asociaciones en el árbol
        dictionary.insert(new Association<>("dog", "perro"));
        dictionary.insert(new Association<>("homework", "tarea"));
        dictionary.insert(new Association<>("woman", "mujer"));
        dictionary.insert(new Association<>("town", "pueblo"));
        dictionary.insert(new Association<>("yes", "si"));

        // Procesar el archivo de texto y traducir cada palabra
        String text = "The woman asked me to do my homework about my town.";
        String[] words = text.split(" ");
        for (String word : words) {
            Association<String, String> translation = dictionary.search(new Association<>(word.toLowerCase(), null));
            if (translation != null) {
                System.out.print(translation.value + " ");
            } else {
                System.out.print("*" + word + "* ");
            }
        }
    }
}

