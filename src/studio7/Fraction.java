package studio7;

public class Fraction {

private int numerator;
private int denominator;

public Fraction(int initNumerator, int initDenominator) {
	this.numerator = initNumerator;
	this.denominator = initDenominator;
}

public String addFract(Fraction f) {
	int commonD = this.denominator*f.denominator;
	int numerator1 = commonD*this.numerator;
	int numerator2 = commonD*f.denominator;
	String result = (numerator1 + numerator2) + "/" + (commonD);
	return result;
}

public String multFract(Fraction f) {
	int newNum = this.numerator* f.numerator;
	int newDen = this.denominator* f.denominator;
	String product = newNum + "/" + newDen;
	return product;
}

public String recip() {
	String recip = this.denominator + "/" + this.numerator;
	return recip;
}

public static int gcd(int p, int q) {
	if(p%q == 0) {
		return q;
	}
	int t =(p%q);
	int gcdValue = gcd(q,t);
	return gcdValue;
}
public String simplify(){
	String result = (this.numerator/gcd(this.numerator, this.denominator)) + "/" + gcd(this.numerator, this.denominator);
	return result;
}
}
