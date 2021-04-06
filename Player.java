
public class Player {
	private int level;
	private int damage;
	private int health;
	private int exp;
	private String displayName;
	
	public Player(String displayName) {
		this.displayName=displayName;
		this.level=1;
		this.damage=5;
		this.health=100;
		this.exp=0;
	}
	
	public void levelUp() {
		this.level++;
		this.damage++;
		this.health+=5;
		System.out.println( "Player \""+displayName+"\" has leveled up to level "+level+"!");
	}
	
	public void kill() {
		this.damage=5;
		this.health=100;
		this.level=1;
		this.exp=0;
	}
	
	public void changeName(String newName) {
		this.displayName=newName;
	}
	
	public void addExp() {
		exp+=1;
		if(exp>=5*level) {
			exp-=5*level;
			levelUp();
		}
	}
	
	public String toString() {
		return "display name=\""+displayName+"\" level="+level+" damage="+damage+" health="+health+" exp="+exp;
	}
}
