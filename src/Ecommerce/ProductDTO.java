package Ecommerce;

public class ProductDTO {
	// 상품이름
	private String name;
	// 상품 가격
	private int price;
	// 상품 설명
	private String description;
	// 상품 이미지 경로
	private String imageUrl;
	// 상품 색상
	private String color;
	// 상품 크기
	private int size;
	// 상품 할인율
	private int discount;
	// 상품 카테고리 id
	private int categoryId;
	// 상품 등록 일자
	private String createTimestamp;
	// 상품 수정 일자
	private String updateTimestamp;
	// 상품 할인 가격
	private int discountPrice;
	
	public void info() {
		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("description : " + this.description);
		System.out.println("imageUrl : " + this.imageUrl);
		System.out.println("color : " + this.color);
		System.out.println("size : " + this.size);
		System.out.println("discount : " + this.discount);
		System.out.println("categoryId : " + this.categoryId);
		System.out.println("createTimestamp : " + this.createTimestamp);
		System.out.println("updateTimestamp : " + this.updateTimestamp);
		System.out.println("discountPrice : " + this.discountPrice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(String updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

}
