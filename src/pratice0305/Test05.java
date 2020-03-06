package pratice0305;



public class Test05 {

	public static void main(String[] args) {
		String tan= "SPAM";
		for(int i = 0;i<10;i++){
			System.out.println(tan);
		}

		for(int t=3;t<=27;t++){
			if(t%3==0){
				System.out.println(t);
			}
		}
		
		
		int a =2; 
//		
//		public void toCsv() throws IOException {
//			FileOutputStream fileOutputStream = new FileOutputStream("D:\\book.csv");
//			List<Book> list = showAll();
//			String textString="";
//			for (Book book : list) {
//				textString =book.getId() + "," + book.getName() + "," + book.getPrice() + "," + book.getAuthor()+"\n";
//				fileOutputStream.write(textString.getBytes());
//			}
//		}
//		
//		
//		
//		
		
		
		
		
		for(int b=1;b<8;++b){
			System.out.println(a*=b);
		}
		
		
		

	}

}
