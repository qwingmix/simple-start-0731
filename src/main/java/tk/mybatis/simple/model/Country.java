package tk.mybatis.simple.model;

//PO类，属性名和数据库表的字段对应
//这里是最简单的模型， 把数据库字段跟程序在内存中的属性对应起来

public class Country {
	private Long id;//为什么是long呢，奇怪， 难道是担心country有很多国家吗，这里的id在数据库里面只不过是自增长ID
	private String countryname;
	private String countrycode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

}
