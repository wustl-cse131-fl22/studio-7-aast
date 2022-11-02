package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(double initReal, double initImaginary) {
		this.real = initReal;
		this.imaginary = initImaginary;
	}
	
	public String add(Complex c) {
		double newReal = this.real + c.real;
		double newImagin = this.imaginary +  c.imaginary;
		String result = newReal + "+" + newImagin + "i";
		return result;
	}
	
	public String mult(Complex c) {
		double newReal = this.real*c.real - this.imaginary*c.imaginary;
		double newImag = this.real*c.imaginary + this.imaginary*c.real;
		String result = newReal + "+" + newImag + "i";
		return result;
	}
	
	
	
}