package pratice0305;



public class Test01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1-1
		System.out.println("Hello World");

		//1-2
		int X = 11;
		System.out.println("X="+X);

		//1-3
		int x =13;
		int y =17;
		System.out.println("x="+x+";"+"y="+y);

		//1-4
		int x1 =13+17;
	
		System.out.println(x1);

		//1-5
		System.out.println(13+17);

		//1-6
		int t =7;
		t=3*t;
		System.out.println(t);
		t=t/2;
		System.out.println(t);

		Method me = new Method();
		int[]left= new int[]{1,2,3,4};
		int[] right = new int[]{5,6,7,8};
		
		//System.out.println(Arrays.toString(me.megerArray(left, right)));
		//System.out.println(Arrays.toString(me.Array(left, right)));
		
		//1-7
		int q =3;
		int w =7;
		int s =0;
		s=q;
		q=w;
		w=s;
		System.out.println("q="+q+"w="+w);
		
		//1-8
		int xx=19;
		int yy=23;
		int zz =xx+yy;
		System.out.println(zz);
		
//		1-9
		int xxx=2;
		System.out.println(xxx*2);
		System.out.println(xxx*3);
		System.out.println(xxx*4);
//		1-10
		
	}

}
