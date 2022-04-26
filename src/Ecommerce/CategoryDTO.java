package Ecommerce;

public class CategoryDTO {
	// 카테고리 부모 id
	private int idParent;
	// 카테고리 제목
	private String title;
	// 카테고리 아이콘
	private String icon;
	// 카테고리 설명
	private String description;

	public void info() {
		System.out.println("idParent : " + this.idParent);
		System.out.println("title : " + this.title);
		System.out.println("icon : " + this.icon);
		System.out.println("description : " + this.description);
	}
	
	public int getIdParent() {
		return idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
