package test0306;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<Book> Lib = new ArrayList<Book>();
	// カンマ
	private static final String COMMA = ",";
	// 改行
	private static final String NEW_LINE = "\r\n";

	// add
	public void add(Book book) {
		Lib.add(book);
		System.out.println("図書" + "[" + book.getName() + "]" + "を図書館に入れた");

	}

	// 削除
	public void delete(int id) {
		for (Book book : Lib) {
			if (book.getId() == id) {
				Lib.remove(book);
				System.out.println("図書[" + book.getName() + "]は" + book.getId()
						+ "番号によって図書館から削除された");
				break;
			}
		}
	}

	// 更新
	public void update(String name, int price) {
		for (Book book : Lib) {
			if (book.getName().equals(name)) {
				book.setPrice(price);
			}

		}
		System.out.println("価格が更新された");
	}

	// idによって検索
	public Book query(int id) {

		for (Book book : Lib) {
			if (book.getId() == id) {
				return book;
			}

		}
		return null;

	}

	// 作者によって検索
	public Book serch(String writer) {

		for (Book book : Lib) {
			if (book.getWriter().equals(writer)) {
				return book;

			}
		}
		return null;

	}

	// 一覧-1
	public List<Book> showAll() {
		for (Book book : Lib) {
			System.out.println("図書番号:" + book.id + " 図書名:" + "[" + book.name
					+ "]" + " 作者:" + book.writer + " 価格:" + book.price + "円");
		}
		return Lib;
	}

	// // 一覧-2
	// public List<Book> showAll1() {
	// return Lib;
	//
	// }

	// CSVに書き込み
	public void exportCsv() {
		try {
			// FileWriterクラスのオブジェクトを生成する
			FileWriter file = new FileWriter(
					"C:\\Users\\呉青芳\\Desktop\\Bookkk.csv");
			// PrintWriterクラスのオブジェクトを生成する
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			// ファイルに書き込む
			// List<Book> list = showAll();
			// ヘッダーを指定する
			pw.print("図書番号");
			pw.print(COMMA);
			pw.print("図書名");
			pw.print(COMMA);
			pw.print("作者");
			pw.print(COMMA);
			pw.print("価格");
			pw.print(NEW_LINE);

			for (Book book : Lib) {

				pw.print(book.getId());
				pw.print(COMMA);
				pw.print(book.getName());
				pw.print(COMMA);
				pw.print(book.getWriter());
				pw.print(COMMA);
				pw.print(book.getPrice());
				pw.print(NEW_LINE);

			}

			// ファイルを閉じる
			System.out.println("CSVファイル出力完了");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
