package test0306;



public class Library {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Manager book = new Manager();

		String book1 = "鬼滅の刃";
		String writer1 = "吾峠呼世晴";
		int price1 = 7_744;
		String book2 = "僕のヒーローアカデミア";
		String writer2 = "堀越耕平";
		int price2 = 12_584;
		String book3 = "ドロヘドロ";
		String writer3 = "林田球";
		int price3 = 22_552;
		String book4 = "はたらく細胞";
		String writer4 = "清水茜";
		int price4 = 3_300;
		String book5 = "ワンピース";
		String writer5 = "尾田栄一郎";
		int price5 = 45_980;
		String book6 = "トーキョーグール−";
		String writer6 = "石田スイ";
		int price6 = 9_988;

		book.add(new Book(1001, book1, writer1, price1));
		book.add(new Book(1002, book2, writer2, price2));
		book.add(new Book(1003, book3, writer3, price3));
		book.add(new Book(1004, book4, writer4, price4));
		book.add(new Book(1005, book5, writer5, price5));
		book.add(new Book(1006, book6, writer6, price6));

		book.delete(1002);

		book.showAll();
		System.out.println("===============漫画ランキングによって=======================");

		book.update(book6, 1232);
		
		book.exportCsv();
		System.out.println(book.query(1003));
		System.out.println(book.serch(writer5));


	}

}
