import org.generation.hashmapC.MethodsHashMap;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {
                42, 17, 83, 5, 91, 36, 74, 28, 63, 11,
                55, 97, 24, 68, 3, 79, 46, 14, 88, 31,
                72, 9, 61, 25, 94, 50, 37, 81, 19, 66,
                7, 43, 89, 12, 58, 34, 76, 21, 95, 48,
                16, 70, 29, 85, 4, 53, 62, 18, 99, 40,
                27, 73, 10, 87, 35, 64, 22, 92, 51, 6,
                78, 13, 45, 86, 30, 59, 96, 23, 71, 8,
                54, 39, 82, 15, 67, 26, 90, 49, 32, 75,
                20, 57, 98, 44, 69, 33, 84, 1, 60, 47,
                77, 38, 93, 56, 2, 80, 41, 65, 52, 100
        };

        /*
        MethodsArray prueba = new MethodsArray();
        int[] result = prueba.multiplos(numeros,3);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(result));

        //Prueba del método para sacar el promedio
        System.out.println("El promedio del primer array es: "+prueba.meanOfArray(numeros));
        System.out.println("El promedio del segundo array es: "+prueba.meanOfArray(result));
         */


        /*
        ArrayList<Integer> ages = new ArrayList<>();
        for(Integer i=0;i<21;i++){
            ages.add(i);
        }
        System.out.println(ages);
        System.out.println("La suma de todos los elementos es: "+ MethodsArrayList.getTotal(ages));

        ArrayList<Integer> calificaciones = MethodsArrayList.scoreCapture();
        System.out.println(calificaciones);

        System.out.println("El promedio de estas calificaciones es: "+MethodsArrayList.getAverage(calificaciones));

        System.out.println("La calificación más grande es: "+MethodsArrayList.getMaxGrade(calificaciones));
         */


        /*
        HashSet<String> users = new HashSet<>();
        MethodsHashSet.logUser(users,"Alberto");
        MethodsHashSet.logUser(users,"Josué");
        MethodsHashSet.logUser(users,"Dayana");
        MethodsHashSet.logUser(users,"Rosario");
        MethodsHashSet.logUser(users,"Diego");
        MethodsHashSet.logUser(users,"David");
        MethodsHashSet.logUser(users,"Sebastian");
        //Repetidos
        MethodsHashSet.logUser(users,"Alberto");
        MethodsHashSet.logUser(users,"Diego");
        MethodsHashSet.logUser(users,"Sebastián");
        System.out.println(users);
        */

        //Pruebas métodos HashMap
        String text = "Technologies based on NLP are becoming increasingly widespread for example phones and handheld computers support predictive text and handwriting recognition web search engines give access to information locked up in unstructured text machine translation allows us to retrieve texts written in Chinese and read them in Spanish text analysis enables us to detect sentiment in tweets and blogs by providing more natural human machine interfaces and more sophisticated access to stored information language processing has come to play a central role in the multilingual information society this book provides a highly accessible introduction to the field of NLP it can be used for individual study or as the textbook for a course on natural language processing or computational linguistics or as a supplement to courses in artificial intelligence text mining or corpus linguistics the book is intensely practical containing hundreds of fully worked examples and graded exercises";

        System.out.println(MethodsHashMap.wordCounter(text));
        System.out.println(MethodsHashMap.wordCounter2(text));
    }
}