punblic class Book extends TangibleAsset{
	private String isbn;

	public Book(String name, int price, String color, Stirng isbn){
		super(name, price, color);
		this.isbn = isbn;
	}
	public Stirng getIsbn(){
		return this.isbn;
	}
}
