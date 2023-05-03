package May03;

public class factor {

int num;

public factor() {
}

public factor(int num) {
	this.num = num;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}
public static int Fact(int num) {
	int factor = 1;
	for (int i = 1; i <= num; i++) {
		factor *=i; 
}
	return factor;
}
	
	
	
}
