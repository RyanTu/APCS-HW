public class Driver{
    public static void main(String args[]){
	String name = new String("ryan tu");
	int space = name.indexOf(" ");

	String first = new String(name.substring(0,space));

	String last = new String(name.substring(space+1,name.length()));
    }
}
