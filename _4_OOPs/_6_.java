package _4_OOPs;
/* ------------------------------------------------------IMPORTANT-------------------------------------------------------------------------------
 	Print the sum, difference and product of two complex numbers by creating a class name "Complex" with separate 
 	methods for each operation whose real and imaginary parts are entered by user.
 */
class Complex
{
	int real, imag;
	Complex(int r, int i)
	{
		real=r;
		imag=i;
	}
	
	static Complex add(Complex a, Complex b)
	{
		return new Complex((a.real+b.real), (a.imag+b.imag));
	}
	
	static Complex diff(Complex a, Complex b)
	{
		return new Complex((a.real-b.real), (a.imag-b.imag));
	}
	
	static Complex product(Complex a, Complex b)
	{
		return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
	}
	void printComplex()
	{
		if(real==0 && imag !=0)
		{
			System.out.println(imag+ " i");
		}
		else if(real !=0 && imag==0)
		{
			System.out.println(real);
		}
		else
		{
			System.out.println(real+ " + "+imag+" i");
		}
	}
}
public class _6_ 
{
	public static void main(String[] args) 
	{
		Complex c=new Complex(4, 5);
		Complex d= new Complex(9, 4);
		c.printComplex();
		d.printComplex();
		
		Complex ad = Complex.add(c, d);
		Complex dif = Complex.diff(c, d);
		Complex pro=Complex.product(c, d);
		System.out.println("---------------------------------------------");
		ad.printComplex();
		System.out.println("---------------------------------------------");
		dif.printComplex();
		System.out.println("---------------------------------------------");
		pro.printComplex();
		System.out.println("---------------------------------------------");
	}
}
