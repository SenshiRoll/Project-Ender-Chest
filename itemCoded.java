
public class itemCoded extends Encoder {
	public String name;
	public int code;
	public itemCoded(String name,int code) {
	this.name=name;
	this.code=code;
	}
	public itemCoded(int code) {
		this.code=code;
		name=String.valueOf(code);
	}
	public String getItem() {
		return name;
	}
	public int getCode() {
		return code;
	}
}
