package tk.mybatis.simple.mapper;



//这里是一个测试类
//草他妈的，跟着书来做，改写这个文件的时候，没有新建一个对应的CountryMapper接口，所以报错一直报错。
//Mapped Statements collection does not contain value for 
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.Country;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;


//继承了baseMapper， 里面有@begin
public class UserMapperTest extends BaseMapperTest{
	
	
	/*
	@Test
	public void testSelectById(){
		//在前面工厂店的基础上打开一个session
		SqlSession sqlSession = getSqlSession();
		try {
			
			//获取UserMapper接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectById方法，查询 id=1的用户
			SysUser user = userMapper.selectById(1L);
			//user不为空
			Assert.assertNotNull(user);
			//userName = admin
			Assert.assertEquals("admin", user.getUserName());
			} finally {
			sqlSession.close();//会话也是用完就要关闭
		}
	}

	

	@Test
	public void testSelectAll(){
		//在前面工厂店的基础上打开一个session
		SqlSession sqlSession = getSqlSession();
		try {
			
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectAll方法查询所有用户
			List<SysUser> userList = userMapper.selectAll();
			//结果不为空
			Assert.assertNotNull(userList);
			//用户数量大于0个
			Assert.assertTrue(userList.size()>0);
		} finally {
			sqlSession.close();//会话也是用完就要关闭
		}
	}
	
	private void printCountryList(List<Country> countryList){
		for(Country country : countryList){//返回的是多行查询结果， 一个个国家
			System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryname(), country.getCountrycode());
		}
	}
	*/
	
	@Test
	public void testSelectRolesByUserId() {
		//在前面工厂店的基础上打开一个session
				SqlSession sqlSession = getSqlSession();
				try {
					
					UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
					//调用selectAll方法查询所有用户
					List<SysRole> roleList = userMapper.selectRolesByUserId(1L);
					//结果不为空
					Assert.assertNotNull(roleList);
					//用户数量大于0个
					Assert.assertTrue(roleList.size()>0);
				} finally {
					sqlSession.close();//会话也是用完就要关闭
				}
		
	}

	
	
	
}
