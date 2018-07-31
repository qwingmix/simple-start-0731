package tk.mybatis.simple.mapper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

public class BaseMapperTest {
	private static SqlSessionFactory sqlSessionFactory;
	@BeforeClass
	public static void init(){
		try {
			//首先是先读取资源配置文件xml,拿到服务器的地址， 账号，密码
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //读取完流文件要记得关闭。 
            reader.close();
        } catch (IOException ignore) {//这个ignore是什么意思，完全不懂
        	ignore.printStackTrace();
        }
	}
	
	public SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}

}
