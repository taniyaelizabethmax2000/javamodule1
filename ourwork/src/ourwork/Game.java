package ourwork;

public class Game {

	public static void main(String[] args) {
	int a[]= {0,0,0,1,0};
	int n=5;
	int i=0,leap=3;
	while(true) {
		if(a[i+1]==0) {
			i++;
			continue;
		}
		else {
			i=i+leap;
			if(i>n) {
				 System.out.println(true);
				 break;
				}
			else if(i<n && a[i]==1) {
				System.out.println(false);
				break;
				
			}
		}
	}

	}

}
