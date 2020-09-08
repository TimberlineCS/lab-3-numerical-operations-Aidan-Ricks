public class numop{
  public static void main(String args[]){
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
System.out.println(57.2 * (i1/i2) + 1);
System.out.println(57.2 * ((double)i1/i2) + 1);
System.out.println(15-i1 * (d1 * 3) + 4);
System.out.println(15-i1 * ((int)d1 * 3) + 4);
System.out.println(15-i1 * (int)(d1 * 3) + 4);

int num = 1234;

String p1 = ""+ (num%10);
String p2 = ""+ ((num/10) % 10);
String p3 = ""+ ((num/100)%10);
String p4 = ""+ ((num/1000)%10);

System.out.print(p1 + p2 + p3 + p4);


  }


}