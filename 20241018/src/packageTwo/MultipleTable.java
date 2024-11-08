package packageTwo;

public class MultipleTable {
	MultipleTable(int num){
		this.ShowMultipleTable(num);
	}
	void ShowMultipleTable(int num) {
		System.out.printf("[ %d단  ]\n",num);
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}
