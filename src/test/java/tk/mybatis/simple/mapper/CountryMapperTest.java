package tk.mybatis.simple.mapper;



//这里是一个测试类
//草他妈的，跟着书来做，改写这个文件的时候，没有新建一个对应的CountryMapper接口，所以报错一直报错。
//Mapped Statements collection does not contain value for 




import java.util.List;


import org.apache.ibatis.session.SqlSession;


import org.junit.Test;

import tk.mybatis.simple.model.Country;


//继承了baseMapper， 里面有@begin
public class CountryMapperTest extends BaseMapperTest{

	@Test
	public void testSelectAll(){
		//在前面工厂店的基础上打开一个session
		SqlSession sqlSession = getSqlSession();
		try {
			
			//session都提供了很多专用的方法， 这里的selectList就是用来查询多条结果的，我记得是。 
			List<Country> countryList = sqlSession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");//这里的selectAll参数，就是mapper映射文件里面的statement id了。 就是CountryMapper.xml里面的ID
			printCountryList(countryList);//别急， 这里的printCountryList是下面 自己来写方法实现
		} finally {
			sqlSession.close();//会话也是用完就要关闭
		}
	}
	
	private void printCountryList(List<Country> countryList){
		for(Country country : countryList){//返回的是多行查询结果， 一个个国家
			System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryname(), country.getCountrycode());
		}
	}
}
