  
/** 
* Program berikut untuk mencoba statemen continue
*/
public class CobaContinue
{
public static void main(String arg[])
{
for (int i=0; i<10; i++)
{
for (int j=0; j<i+1; j++)
{
if(j==5)
break;
System.out.print('*');
}
System.out.println();
}
}
} 