class Instrument {
	protected String name;
	protected String sound;
	
	public Instrument() {
		this.name = "Instrument";
		this.sound = "";
	}
	
	public Instrument(String name) {
		this.name = name;
		this.sound = "";
	}

	public Instrument(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void play() { }
}

class Violin extends Instrument {
	public Violin(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
		System.out.println("(Violin)" + name + " sound: " + sound);
	}
}

class Cello extends Instrument {
	public Cello(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
		System.out.println("(Cello)" + name + " sound: " + sound);
	}
}

class Contrabase extends Instrument {
	public Contrabase(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
		System.out.println("(Contrabase)" + name + " sound: " + sound);
	}
}

class Orchestra {
	Instrument[] instruments;
	int count;
	
	public Orchestra() {
		count = 0;
		instruments = new Instrument[10];
	}
	
	public void setInst(Instrument ins) {
		instruments[count] = ins;
		count++;
	}
	
	public void play() {
	  for (int i=0 ; i<count ; i++){
		  instruments[i].play();
	  }
	}
}

class Main {
  public static void main(String[] args) {
    Violin v1 = new Violin("Violin 1", "vivivi");
		Violin v2 = new Violin("Violin 2", "v2v2v2");
		Cello c1 = new Cello("Cello 1", "chchch");
		Contrabase cb1 = new Contrabase("Contrabase 1", "contcont");
		Contrabase cb2 = new Contrabase("Contrabase 2", "c2c2");
		
		Orchestra orch = new Orchestra();
		orch.setInst(v1);
		orch.setInst(v2);
		orch.setInst(c1);
		orch.setInst(cb1);
		orch.setInst(cb2);
		
		orch.play();
  }
}