
public class Box {
	Item[] box;
	Box(Item[] itemList){
		box=new Item[27];
		for(int i=0;i<itemList.length || i<27;i++) {
			box[i]=itemList[i];
		}
	}
}
