package BST;

public class NoOfUniqueBST {

	public static int numTrees(int n){
		int g[] = new int[n+1];
		g[0] = 1;
		g[1] = 1;
		
		for(int i=2; i<=n; i++){
			for(int j=1 ; j<=i ;j++){
				g[i] += g[j-1]*g[i-j];
			}
		}
		
		return g[n];
	}
	
	public static void main(String[] args) {
		int n =4;
		System.out.println(numTrees(n));
	}

}
