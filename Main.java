import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String,Player> playerMap=new HashMap<String,Player>();
		playerMap.put("lrstover", new Player("Lance Stover"));
		playerMap.put("jspacco", new Player("Mr. Spacco"));
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").kill();
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("lrstover").changeName("Lance");
		System.out.println(playerMap.get("lrstover"));
		playerMap.get("jspacco").addExp();
		System.out.println(playerMap.get("jspacco"));
		//test adding lots of exp
		for(int i=0; i<1000; i++)
			playerMap.get("lrstover").addExp();
		System.out.println(playerMap.get("lrstover"));
	}
}
