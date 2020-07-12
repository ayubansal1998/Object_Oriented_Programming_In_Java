class Gear{
	private double chainRing,cogRing;
	private Wheel wheelObj;

	Gear(double chainRing,double cogRing) {
		this.chainRing=chainRing;
		this.cogRing=cogRing;
		this.wheelObj=new Wheel(0,0);
	}

	Gear(double chainRing ,double cogRing , Wheel wheelObj) {
		this.chainRing=chainRing;
		this.cogRing = cogRing;
		this.wheelObj = wheelObj;
	}

	boolean zeroCheck() {
		return (cogRing == 0);
	}

	double gearRatio(){
		if(zeroCheck())
			return 0.0;
		return chainRing / cogRing ;
	}

	double gearInches() {
		return gearRatio() * wheelObj.wheelDiameter() ;
	}

}

class Wheel{
	double PI = 3.14;
	private double rim,tire;

	Wheel(double rim,double tire) {
		this.rim = rim;
		this.tire = tire;
	}

	double wheelDiameter() {
		return rim + (tire * 2);
	}

	double wheelCircumference() {
		return wheelDiameter() * PI;
	}

}

class SingleResponsibilityFunction {
	public static void main(String[] args) {
		Wheel wheelObj = new Wheel(26 , 1.5);
		System.out.println(wheelObj.wheelCircumference());

		Gear gearObj1 = new Gear(52 ,11 , wheelObj );
		System.out.println(gearObj1.gearInches());

		Gear gearObj2 = new Gear(52 ,11);
		System.out.println(gearObj2.gearRatio());
	}
}