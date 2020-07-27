
public class infoPackage {
	public char action;
	public Item item;
	public int amount; //amount is handled in shulker boxes
	infoPackage(char action,Item item,int amount){
		action=this.action;
		item=this.item;
		amount=this.amount;
	}
	infoPackage(char action,Item item){
		action=this.action;
		item=this.item;
		amount=1;
	}
}
