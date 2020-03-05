package pratice0305;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 4;
		int y = 4;
		if (x > y) {
			System.out.println("x>y");
		} else if (x < y) {
			System.out.println("x<y");
		} else {
			System.out.println("x=y");
		}

		String[] jyy = { "jjy", "kiku", "hyx" };
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			String jyys = jyy[r.nextInt(3)];
			System.out.println(jyys);
		}

		int e = 12;
		if (e % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		System.out.println("================");

		// 3-6
		int k = -3;
		if (k > 0) {
			if (k % 2 == 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("正の奇数");
			}
		} else if (k < 0) {

			if (k % 2 == 0) {
				System.out.println("負の偶数");
			} else {
				System.out.println("負の奇数");
			}
		} else {
			System.out.println("自然数");
		}

		// 3-7

		int test = 100;
		if (test >= 60) {
			if (test >= 60 && test < 80) {
				System.out.println("よくできました。");
			} else {
				System.out.println("たいへんよくできました");
			}
		} else {
			System.out.println("ざんねんでした");
		}

		// 3-8

		int mid = 11;
		int end = 90;
		if (mid >= 60 && end >= 60) {
			System.out.println("合格");
		}
		if (mid + end >= 130) {
			System.out.println("合格");
		}
		if (mid + end >= 100 && (mid >= 90 || end >= 90)) {
			System.out.println("合格");
		}
		else{
			System.out.println("不合格");
		}
		
		
//		3-9
		
		int xx=23;
		int yy =33;
		if( xx<yy&&xx%2==0&&yy%2==0 )
		    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

		if(xx==yy&&xx<0&&yy<0 )
		    System.out.println( "xとyは等しく、かつ、負の数である。" );

		if( xx<yy||xx%2==0)
		    System.out.println( "xはyより小さい、または、xは偶数である。" );

		if(xx<=10||xx>=100&&y>=10&&y<=100)
		    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

		if( xx>=0&&yy>=0 )
		    System.out.println( "xもyも負の数である、ではない。" );
		
		
		
		
		
	}
}
