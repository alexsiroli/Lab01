class ComplexNumCalculator {

	int nOpDone;
	ComplexNum lastRes;
	
	void build() {
		nOpDone = 0;
	}
	
	ComplexNum add(ComplexNum a, ComplexNum b) {
		ComplexNum res = new ComplexNum();
		res.build(a.re + b.re, a.im + b.im);
		this.nOpDone = nOpDone + 1;
		this.lastRes = res;
		return res;
	}
	
	ComplexNum sub(ComplexNum a, ComplexNum b) {
		ComplexNum res = new ComplexNum();
		res.build(a.re - b.re, a.im - b.im);
		this.nOpDone = nOpDone + 1;
		this.lastRes = res;
		return res;
	}
	
	ComplexNum mul(ComplexNum a, ComplexNum b) {
		ComplexNum res = new ComplexNum();
		double re = a.re * b.re - a.im * b.im;
		double im = a.im * b.re + a.re * b.im;
		res.build(re, im);
		this.nOpDone = nOpDone + 1;
		this.lastRes = res;
		return res;
	}
	
	ComplexNum div(ComplexNum a, ComplexNum b) {
		ComplexNum res = new ComplexNum();
		double re = (a.re * b.re + a.im * b.im) / (a.im * b.im + a.re * b.re);
		double im = (a.im * b.re + a.re * b.im) / (a.im * b.im + a.re * b.re);
		res.build(re, im);
		this.nOpDone = nOpDone + 1;
		this.lastRes = res;
		return res;
	}
	
}
