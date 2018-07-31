package tk.mybatis.simple.mapper;

import java.util.List;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {

	/*通过ID查询用户*/
	SysUser selectById(Long id);
	
	
	/*查询全部用户*/
	List<SysUser> selectAll(); //注意了 这里返回的可不是SysUser
	
	
	/*根据用户id获取角色信息*/
	List<SysRole> selectRolesByUserId(Long userId);
}
