package org.generation.hashmapC;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        /**
         * REFERENCIAS
         * https://www-w3schools-com.translate.goog/java/java_hashmap.asp?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc
         * https://www.w3schools.com/java/java_hashmap.asp
         * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
         */

        /**
         * HashMap es la implementación que hace Java de una estructura de datos llamada Map
         *
         * Map:
         * 1. Es una estructura desordenada, no garantiza mantener el orden de inserción
         * 2. Es una estructura key : value
         * 3. Las llaves actúan como un set, esto quiere decir que no admiten duplicados
         */

        //Para declararlo
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("México","CDMX");
        capitals.put("España","Madrid");
        System.out.println(capitals);
        capitals.put("Perú", "Lima");
        capitals.put("Suecia","Estocolmo");
        capitals.put("Argentina","Buenos Aires");
        capitals.put("Canadá","Toronto");
        System.out.println(capitals.get("Perú"));
        System.out.println(capitals.size());

        for(String key : capitals.keySet()){
            System.out.println("La capital de "+key+" es "+capitals.get(key));
        }

        for(String value : capitals.values()){
            System.out.println("El valor es: "+value);
        }

        //Si no sabemos con qué tipo de dato estamos tratando podemos usar la definición var, que es de tipo dinámico. Aunque en cuanto se define su tipo de dato, con ese se queda
        var keyCapitals = capitals.keySet(); //Si no se sabe qué tipo de dato son las llaves de capitals, se define como var y una vez que averigue el tipo de dato (en este caso String) ya se quedará como ese tipo.
        var valuesCapitals = capitals.values();
        System.out.println(keyCapitals);
        System.out.println(valuesCapitals);

        //Para eliminar usamos remove
        System.out.println(capitals.remove("México","Tlaxcala"));
        System.out.println(capitals.remove("Perú","Lima"));
        System.out.println(capitals.remove("España"));
        System.out.println(capitals);

        System.out.println(capitals.containsKey("México"));
        System.out.println(capitals.containsKey("mexico"));
        System.out.println(capitals.containsValue("CDMX"));
        System.out.println(capitals.containsValue("Monterrey"));


    }
}
