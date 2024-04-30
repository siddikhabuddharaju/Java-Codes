import java.util.HashMap;
import java.util.Map;
public class mapinterJava {
public static void main(String[] args) {
Map<String, String> SId = new HashMap<>();
SId.put("gayamma", "501");
SId.put("siddikha", "523");
SId.put("harshi", "566");
SId.put("keerthana", "550");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
System.out.println("\n");
System.out.println("Changing -> gayamma : 501 - l501");
SId.put("gayamma", "l501");
System.out.println("Removing -> keerthana : 550");
SId.remove("keerthana");
boolean sidd = SId.containsKey("siddikha");
System.out.println("Is there any Student Id with siddikha ? --> " + sidd);
System.out.println("\n");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
}
}
