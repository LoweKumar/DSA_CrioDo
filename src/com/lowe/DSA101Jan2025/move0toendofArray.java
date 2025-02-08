import java.util.*;
class MoveZeroes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Vector<Integer> vec = new Vector<Integer>();
		for(int i=0;i<n;i++)
			vec.add(sc.nextInt());
		Vector<Integer> res = moveZeroes(vec);
		for(Integer elem : res)
			System.out.print(elem+" ");
	}
	private static Vector<Integer> moveZeroes(Vector<Integer> vec){
		int n = vec.size();
		int index = 0;
		for(int i=0; i<n; i++)
		{
			if(vec.get(i)!=0){
			vec.set(index, vec.get(i));
			if(index!=i){
				vec.set(i,0);
			}
			index++;
		}
			
		}
		return vec;
	}
}