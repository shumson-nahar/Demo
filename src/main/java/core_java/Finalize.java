package core_java;

public class Finalize {
	public void finilize() {
		System.out.println("finalized method"); {
			
		}
	}

	public static void main(String[] args) {
	
		Finalize f1= new Finalize ();
		Finalize f2= new Finalize ();
		f1=null;
		f2=null;
		System.gc();
		

	}

}
