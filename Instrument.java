
abstract class Instrument {

	abstract void utilize();
}

abstract class MedicalInstrument extends Instrument {

	abstract void diagnose();
}

abstract class SurgicalMedicalInstrument extends MedicalInstrument {

	abstract void sterilize();

	abstract void doesSurgery();
}

class Needle extends SurgicalMedicalInstrument {

	@Override
	void sterilize() {
		System.out.println("needle is sterlize");
	}

	@Override
	void doesSurgery() {
		System.out.println("can be used in surgery");
	}

	void operate() {
		System.out.println("ready to operate");
	}

	@Override
	void utilize() {
		System.out.println("can be utilized");
	}

	@Override
	void diagnose() {
		System.out.println("needle takes blood to diagnose");
	}
}

class Cutter extends SurgicalMedicalInstrument {

	void cutter() {
		System.out.println("can be cut");
	}

	@Override
	void sterilize() {
		System.out.println("cutter is sterilized");
	}

	@Override
	void doesSurgery() {
		System.out.println("cutter is ready for surgery");
	}

	void operate() {
		System.out.println("cutter can be used for operation now..");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("cutter being utilized now");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		
	}
}

abstract class PathologicalMedicalInstrument extends MedicalInstrument {

	void read() {
		System.out.println("reading..");
	}

	void needElectricalSupply() {
		System.out.println("provide a electrical supply");
	}

	void scan() {
		System.out.println("Scanning is in process..");
	}
}

class Glucometer extends PathologicalMedicalInstrument {

	@Override
	void utilize() {
		System.out.println("Glucometer utilized for diabetes");
	}

	@Override
	void diagnose() {
		System.out.println("Glucometer diagnosing");
	}

}
