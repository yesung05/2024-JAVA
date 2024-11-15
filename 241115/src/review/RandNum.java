package review;

public class RandNum {
	private int[] iAry = new int[10];
	private int iAryMaxVal = 100;
	
	void makeAry() {
		if(iAry != new int[10]) {
			resetAry();
		}
		
		int cnt = 0;
		while (cnt<iAry.length) {
			boolean bSame = false;
			
			int iTemp = (int)(Math.random()*iAryMaxVal)+1;
			
			for(int i = 0; i<cnt; i++) {
				if(iTemp == this.iAry[i]) {
					bSame = true;
					break;
				}
			}
			
			if(!bSame) {
				this.iAry[cnt] = iTemp;
				cnt++;
			}
		}
	}
	
	void printAry() {
		for(int i = 0 ; i<this.iAry.length; i++) {
			System.out.printf("%d, ", this.iAry[i]);
		}
		System.out.println();
	}
	
	int getMaxVal() {
		int iMax = 0;
		for(int i = 0 ; i<this.iAry.length; i++) {
			if(iMax < this.iAry[i]) {
				iMax = this.iAry[i];
			}
		}
		return iMax;
	}
	
	int getMinVal() {
		int iMin = iAryMaxVal;
		for(int i = 0 ; i<this.iAry.length; i++) {
			if(iMin > this.iAry[i]) {
				iMin = this.iAry[i];
			}
		}
		return iMin;
	}
	void resetAry() {
		iAry = new int[10];
	}
}
