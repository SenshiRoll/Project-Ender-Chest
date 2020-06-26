public class infoPackage{
    public char action;
    public String item;
    public int amount;
    infoPackage(String[] in){
        action=in[0].charAt(0);
        item=in[1];
        if (in[2].isEmpty()) {amount=1;return;}
        amount=Integer.parseInt(in[2]);
    }
}