package caseStudy;

class MyThread  {
	public void show() {
	for(int i=1; i<=5; i++) {		
		System.out.println("Hello");
		try {
			Thread.sleep(300);
		}catch(Exception e){

			}
		}
	}


	

	public void shower() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(300);
			}catch(Exception e){

			}

		}
	}
	public void three() {
		System.out.println("Goodbye");
	}

	public static void main(String[] args){

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		MyThread obj3 = new MyThread();

		obj1.show();
		obj2.shower();
		obj3.three();

	}
}
