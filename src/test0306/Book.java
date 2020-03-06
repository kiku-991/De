package test0306;


/**
 *
 * @author 呉青芳
 *
 * /**定义添加图书的方法add，
 * 按书名修改价格的方法 update，
 * 按照图书ID删除图书的方法delete，
 * 按ID查询图书的方法query，要求返回Book类型。
   按作者查询的图书的方法 query，要求返回Book类型。
 * 查询所有图书的方法 showAll，
 * 所有图书信息出力到csv文件
 *
 */
public class Book {

	public int id;
	public String name;
	public String writer;
	public int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int id, String name, String writer, int price) {
		super();
		this.id = id;
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", writer=" + writer
				+ ", price=" + price + "]";
	}










}
