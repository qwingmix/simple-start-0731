package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysUser;

public interface RoleMapper {
	SysUser selectById(Long id);

}
