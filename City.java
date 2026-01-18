import java.util.LinkedHashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> routes;

    public City(String name) {
        this.name = name;
        this.routes = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }
     public void addRoute(City city, int cost) {
        routes.put(city, cost);

     }

     public Map<City, Integer> getRoutes() {
        return routes;

     }

     @Override
     public String toString() {
        StringBuilder sb = new StringBuilder(name + " -> ");

        if (routes.isEmpty()) {
            sb.append(name + " не имеет путей");
        }
        else {
            for (Map.Entry<City, Integer> entry : routes.entrySet()) {
                sb.append(entry.getKey().getName())
                        .append(":")
                        .append(entry.getValue())
                        .append(", ");
            }

            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
     }
     public static void test() {

        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addRoute(F, 1);
        A.addRoute(D, 6);
        A.addRoute(B, 5);

        B.addRoute(A, 5);
        B.addRoute(C, 3);

        C.addRoute(D, 4);
        C.addRoute(B, 3);

        D.addRoute(C, 4);
        D.addRoute(A, 6);

        E.addRoute(F, 2);

        F.addRoute(B, 1);
        F.addRoute(E, 2);

         System.out.println(A);
         System.out.println(F);
         System.out.println(B);
         System.out.println(E);
         System.out.println(D);
         System.out.println(C);
     }

}
