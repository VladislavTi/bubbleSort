package main;

public class Sorted {

	
	private int [] Array;
	private int k = 0, x = 0;
	
	Sorted (int [] arr) {
		this.Array = arr;
	}
	
	public void startSort() {
		
		for(int i = 0; i < this.Array.length; i++) {
			this.k = i;
			for(int j = 0; j < this.Array.length - 1 - i; j++) {
				this.x = j;
				if(this.Array[j] > this.Array[j+1]) {
					int item = this.Array[j];
					this.Array[j] = this.Array[j + 1];
					this.Array[j + 1] = item;
				}
			}
		}
	}
	

	
	public double progress() {
		double percent = 0;
	
		percent =  100d * this.k / (double)(this.Array.length);
		
		return percent;
	}
	
}
