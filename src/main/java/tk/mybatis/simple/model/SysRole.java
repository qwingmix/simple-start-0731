package tk.mybatis.simple.model;

import java.util.Date;
//import tk.mybatis.simple.type.Enabled;

public class SysRole {
	private Long id;
	private String roleName;
	//private Enabled enabled;//这个不知道为什么，已经进入了，但是报错。
	private String createBy;
	private Date createTime;
	private SysUser user;//这个可能暂时不写的
/*	private CreateInfo createInfo;//这个可能暂时不写的
*/	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
/*	public Enabled getEnabled() {
		return enabled;
	}
	public void setEnabled(Enabled enabled) {
		this.enabled = enabled;
	}
	
	*/
	
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public SysUser getUser() {
		return user;
	}
	public void setUser(SysUser user) {
		this.user = user;
	}
	
	
/*	public CreateInfo getCreateInfo() {
		return createInfo;
	}
	public void setCreateInfo(CreateInfo createInfo) {
		this.createInfo = createInfo;
	}
	*/
	
	
	

}
