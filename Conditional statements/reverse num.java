public class Main
{
	public static void main(String[] args) {
	    int i,num;
	    num=2894;
	    i=0;
	while(num!=0) {
		i=i*10+num%10;
		num/=10;
	}
	System.out.println(i);
}
}