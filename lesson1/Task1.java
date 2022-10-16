import java.util.Scanner;


public class Task1 {
	//Описываем новый метод для возведения аргуметна а степень b.
	static float getExponentiation(int a, int b)
	{
		float value = a;
		if (b == 0)
		{
			return value;
		}
		if (b > 0)
		{
			for (int i=1; i<b ; i++)
			{
				value *= a;
			}
			return value;
		}
		if (b < 0)
		{
			for (int i=-1; i>b ; i--)
			{
				value *= a;
			}
			
		}
		return 1 / value;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a: ");
		int a = sc.nextInt();
		System.out.println("Введите число b: ");
		int b = sc.nextInt();
		float result = getExponentiation(a, b);
		System.out.println("Число "+ a +" в степени "+ b +" равно: "+ result);
	}
}