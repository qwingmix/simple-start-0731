package tk.mybatis.simple.mapper;



import java.util.Date;
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

	*/
	
	
	

	/*@Test
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
	
	
	
	
/*	@Test
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
*/
	
	
	
	
/*	@Test
	public void testInsert() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//创建一个user对象
			SysUser user = new SysUser();
			user.setUserName("derekTest1");
			user.setUserPassword("654654");
			user.setUserEmail("qwingmix@qq.com");
			user.setUserInfo("test info");
			
			//正常情况下应该读入一张图片存到byte数组中
			user.setHeadImg(new byte[] {1,2,3});
			user.setCreateTime(new Date());
			
			//将新建的饿对象插入到数据库中，特别注意这里的返回值result是执行的SQL影响行数
			int result = userMapper.insert(user);
			//断言一下啊， 只插入了一条数据
			Assert.assertEquals(1, result);
			//id为null，没有给id赋值，并且没有配置回写id的值，  -=--------- 不明白
			Assert.assertNull(user.getId());
		}finally {
			sqlSession.rollback();
			sqlSession.close();
			
			
		}
	}
	*/
	
/*	
	@Test
	public void testInsert2() {//注意， 这里是testInsert2,会返回主键的
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//创建一个 user对象
			SysUser user = new SysUser();
			user.setUserName("tony");
			user.setUserPassword("2342345");
			user.setUserEmail("qwingmix@gmail.com");
			user.setUserInfo("test info");
			user.setHeadImg(new byte[] {1,2,3});
			user.setCreateTime(new Date());
			int result = userMapper.insert2(user);
			Assert.assertEquals(1, result);
			Assert.assertNull(user.getId());
		}finally {
			sqlSession.rollback();
			sqlSession.close();
			
		}
	}*/
	
	
	
	
/*	@Test
	public void testInsert3() {//注意， 这里是testInsert2,会返回主键的
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//创建一个 user对象
			SysUser user = new SysUser();
			user.setUserName("tony");
			user.setUserPassword("2342345");
			user.setUserEmail("qwingmix@gmail.com");
			user.setUserInfo("test info");
			user.setHeadImg(new byte[] {1,2,3});
			user.setCreateTime(new Date());
			int result = userMapper.insert2(user);
			Assert.assertEquals(1, result);
			Assert.assertNull(user.getId());
		}finally {
			sqlSession.rollback();
			sqlSession.close();
			
		}
	}
	*/

/*	
	@Test
	public void testUpdateById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = userMapper.selectById(1L);//这里就用了userMapper接口的方法了。
			//断言当前userName为admin?
			Assert.assertEquals("admin", user.getUserName());
			
			//修改用户名
			user.setUserName("admin_update");
			//修改邮箱
			user.setUserEmail("qwingmix_update@gmail.com");
			//更新成功的话，会返回影响行数
			int result = userMapper.updateById(user);
			
			//断言只更新了1条
			Assert.assertEquals(1, result);
			//再查看一下，id=1的这条记录，是不是按照需求已经被更新
			user = userMapper.selectById(1L);
			//再断言一下用户名是否更新为admin_update
			Assert.assertEquals("admin_update", user.getUserName());
			}finally {
				sqlSession.rollback();
				sqlSession.close();
			}
		
	}
	*/
	
	@Test
	//这个例子很精彩啊， 同时讲到了， 同一个接口里面的 多态？  就是同一个deleteById方法，一个参数是Long,一个参数是SysUser.
	public void deleteById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//从数据库查询1个user对象，根据id=1查询
			SysUser user1 = userMapper.selectById(1L);//这里就用了userMapper接口的方法了。
			Assert.assertNotNull(user1);
			//调用方法删除
			Assert.assertEquals(1, userMapper.deleteById(1L));
			//再次查询，这时候应该没有值，为null
			Assert.assertNull(userMapper.selectById(1L));
			
			
			
			//使用SysUser参数再进行一次测试，根据id=1001查询
			SysUser user2 = userMapper.selectById(1001L);
			Assert.assertNotNull(user2);
			//调用方法删除
			Assert.assertEquals(1, userMapper.deleteById(user2));
			//再次查询，这时候应该没有值，为null
			Assert.assertNull(userMapper.selectById(1001L));
			}finally {
				sqlSession.rollback();
				sqlSession.close();
			}
	}
	
	
	
	
	
}
