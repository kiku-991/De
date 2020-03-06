/**
 *
 */
package test0306;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 呉青芳
 *
 */
public class ManagerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	/**
	 * {@link prt0305.Manager#add(prt0305.Book)} のためのテスト・メソッド。
	 */
	@Test
	public void testAdd() {
		Manager ma = new Manager();
		Book book = new Book(1111, "鬼滅の刃1", "堀耕平", 1244);
		ma.add(book);
	}

	/**
	 * {@link prt0305.Manager#delete(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testDelete() {
		Manager ma = new Manager();
		int id = 1;
		ma.delete(id);
	}

	/**
	 * {@link prt0305.Manager#update(java.lang.String, int)} のためのテスト・メソッド。
	 */
	@Test
	public void testUpdate() {
		Manager ma = new Manager();
		String name = "sdgdg";
		int price = 123;
		ma.update(name, price);
	}

	/**
	 * {@link prt0305.Manager#query(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testQuery() {
		Manager ma = new Manager();
		int id = 24;
		ma.query(id);
	}

	/**
	 * {@link prt0305.Manager#serch(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSerch() {
		Manager ma = new Manager();

		ma.serch("sfag");
	}

	/**
	 * {@link prt0305.Manager#showAll()} のためのテスト・メソッド。
	 */
	@Test
	public void testShowAll() {
		Manager ma = new Manager();
		ma.showAll();
	}

	/**
	 * {@link prt0305.Manager#exportCsv()} のためのテスト・メソッド。
	 */
	@Test
	public void testExportCsv() {
		Manager ma = new Manager();
		ma.exportCsv();
	}

}
