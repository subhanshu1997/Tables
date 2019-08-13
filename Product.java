package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private Integer productID;
	
	@Column
	private String productName;
	
	@Column
	private Integer mechantId;
	
	@Column
	private String[] tag;
	
	@Column 
	private String company;
	
	@Column
	private String photo;
	
	@Column 
	private String description;
	
	@Column
	private String review;
	
	@Column
	private String category;
	
	@Column
	private Integer views;
	
	@Column
	private Integer quantity;
	
	@Column
	private Integer soldQuantities;
	
	@Column
	private Integer price;

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getMechantId() {
		return mechantId;
	}

	public void setMechantId(Integer mechantId) {
		this.mechantId = mechantId;
	}

	public String[] getTag() {
		return tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getSoldQuantities() {
		return soldQuantities;
	}

	public void setSoldQuantities(Integer soldQuantities) {
		this.soldQuantities = soldQuantities;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Product(Integer productID, String productName, Integer mechantId, String[] tag, String company, String photo,
			String description, String review, String category, Integer views, Integer quantity, Integer soldQuantities,
			Integer price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.mechantId = mechantId;
		this.tag = tag;
		this.company = company;
		this.photo = photo;
		this.description = description;
		this.review = review;
		this.category = category;
		this.views = views;
		this.quantity = quantity;
		this.soldQuantities = soldQuantities;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
