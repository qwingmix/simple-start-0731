package tk.mybatis.simple.mapper;

import java.util.List;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {//首先， 这是一个接口，接口里面有很多方法，方法名字 全等于 映射里面的statement id

	/*通过ID查询用户*/
	SysUser selectById(Long id);
	
	
	/*查询全部用户*/
	List<SysUser> selectAll(); //注意了 这里返回的可不是SysUser
	
	
	/*根据用户id获取角色信息*/
	List<SysRole> selectRolesByUserId(Long userId);
	
	
	
	/*新增用户*/
	int insert(SysUser sysUser);
	
	/*新增用户 - 使用useGeneratedKeys方式*/
	int insert2(SysUser sysUser);
	
	
	/*新增用户 - 使用selectKey方式*/
	int insert3(SysUser sysUser);
	
	
	/*根据主键跟新*/
	int updateById(SysUser sysUser);
	
	
	
	
	
	
	//============这里精彩，应该是应用了多态，参数类型不同，方法名相同=================================
	
	/*通过主键删除 _ 参数是Long类型*/
	int deleteById(Long id);
	
	/*通过主键删除_ 参数是SysUser*/
	int deleteById(SysUser sysUser);
	//============================================================================================

	
	
}
