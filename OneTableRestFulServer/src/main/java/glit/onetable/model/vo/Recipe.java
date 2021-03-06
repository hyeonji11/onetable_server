package glit.onetable.model.vo;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Recipe {
	private int recipeIdx;
	private int recipePageId;
	private int userIdx;
	private String recipeName;
	private int price;
	private double servingMin;
	private double servingMax;
	private String recipeImg;
	private String cookTimeMin;
	private double kcal;
	private int category;
	private String nickName;
	private Timestamp recipeDate;
	private double avg;
	private int num;
	private String img;
	private String profileImg;
	private int queryCnt;

	private List<RecipeIngredient> recipeIngredient;
	private List<RecipeMethod> recipeMethod;

	private int limitIndex;
	private int limitCnt;



	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public List<RecipeMethod> getRecipeMethod() {
		return recipeMethod;
	}

	public void setRecipeMethod(List<RecipeMethod> recipeMethod) {
		this.recipeMethod = recipeMethod;
	}

	public int getLimitIndex() {
		return limitIndex;
	}

	public void setLimitIndex(int limitIndex) {
		this.limitIndex = limitIndex;
	}

	public int getLimitCnt() {
		return limitCnt;
	}

	public void setLimitCnt(int limitCnt) {
		this.limitCnt = limitCnt;
	}

	public int getRecipeIdx() {
		return recipeIdx;
	}

	public void setRecipeIdx(int recipeIdx) {
		this.recipeIdx = recipeIdx;
	}

	public int getRecipePageId() {
		return recipePageId;
	}

	public void setRecipePageId(int recipePageId) {
		this.recipePageId = recipePageId;
	}

	public int getUserIdx() {
		return userIdx;
	}

	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getServingMin() {
		return servingMin;
	}

	public void setServingMin(double servingMin) {
		this.servingMin = servingMin;
	}

	public double getServingMax() {
		return servingMax;
	}

	public void setServingMax(double servingMax) {
		this.servingMax = servingMax;
	}

	public String getRecipeImg() {
		return recipeImg;
	}

	public void setRecipeImg(String recipeImg) {
		this.recipeImg = recipeImg;
	}

	public String getCookTimeMin() {
		return cookTimeMin;
	}

	public void setCookTimeMin(String cookTimeMin) {
		this.cookTimeMin = cookTimeMin;
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Timestamp getRecipeDate() {
		return recipeDate;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public List<RecipeIngredient> getRecipeIngredient() {
		return recipeIngredient;
	}

	public void setRecipeIngredient(List<RecipeIngredient> recipeIngredient) {
		this.recipeIngredient = recipeIngredient;
	}

	public void setRecipeDate(Timestamp recipeDate) {
		this.recipeDate = recipeDate;
	}

	public int getQueryCnt() {
		return queryCnt;
	}

	public void setQueryCnt(int queryCnt) {
		this.queryCnt = queryCnt;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

}
