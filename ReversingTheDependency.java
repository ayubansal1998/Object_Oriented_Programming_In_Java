class Gear{
	private double chainRing,cogRing;

	Gear(double chainRing,double cogRing) {
		this.chainRing=chainRing;
		this.cogRing=cogRing;
	}

	boolean zeroCheck() {
		return (cogRing == 0);
	}

	double gearRatio(){
		if(zeroCheck())
			return 0.0;
		return chainRing / cogRing ;
	}

	double gearInches(double diameter) {
		return gearRatio() * diameter ;
	}

}

class Wheel{
	double PI = 3.14;
	private double rim,tire;
	Gear gearObj;

	Wheel(double rim,double tire , double chainRing , double cogRing) {
		this.rim = rim;
		this.tire = tire;
		this.gearObj = new Gear(chainRing,cogRing);
	}

	double wheelDiameter() {
		return rim + (tire * 2);
	}

	double gearInches() {
		return gearObj.gearInches(wheelDiameter()) ;
	}

	double wheelCircumference() {
		return wheelDiameter() * PI;
	}

}

class ReversingTheDependency {
	public static void main(String[] args) {
		Wheel wheelObj = new Wheel(26 , 1.5 ,52 , 11);
		System.out.println(wheelObj.gearInches());

	}
}