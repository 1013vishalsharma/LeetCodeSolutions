
public class TwoSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ret[] = new int[2];
		int arr[] = {2, 7, 11, 15};
		int target = 9;
		for(int i=0; i<arr.length; i++){
			int num = target - arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(num == arr[j]){
					ret[0] = i;
					ret[1] = j;
				}
			}
		}
		
		for(int i=0; i<ret.length; i++)
			System.out.println(ret[i]);

	}

}
