package PEC.item;

public class Box {
	ItemStack[] box;
	Box(ItemStack[] itemList){
		box=new ItemStack[27];
		for(int i=0;i<itemList.length || i<27;i++) {
			box[i]=itemList[i];
		}
	}
}
