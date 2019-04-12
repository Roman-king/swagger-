package com.chaselx.apidoc.enty;


import java.io.Serializable;
import java.util.Date;

/**
 * 资产码表
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
public class Codetable implements Serializable {

    private static final long serialVersionUID = -1552442734313L;
	
	/**
	 * 码表编号
	 */
	private String codeId;
	/**
	 * 码表名称
	 */
	private String codeName;
	/**
	 * 启用状态
	 */
	private String stateId;
	/**
	 * 创建人
	 */
	private String createPerson;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人
	 */
	private String updatePerson;
	/**
	 * 修改时间
	 */
	private Date updateDate;
	/**
	 * 是否删除(0否/1是)
	 */
	private Integer deleteFlag;
	/**
	 *
	 */
	private String createName;
	/**
	 *
	 */
	private String updateName;

	/**
	 * 设置码表编号
	 */
	public void setCodeId(String codeId) {
		this.codeId = codeId == null ? null : codeId.trim();
	}
	/**
	 * 获取码表编号
	 */
	public String getCodeId() {
		return this.codeId;
	}
	/**
	 * 设置码表名称
	 */
	public void setCodeName(String codeName) {
		this.codeName = codeName == null ? null : codeName.trim();
	}
	/**
	 * 获取码表名称
	 */
	public String getCodeName() {
		return this.codeName;
	}
	/**
	 * 设置启用状态
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId == null ? null : stateId.trim();
	}
	/**
	 * 获取启用状态
	 */
	public String getStateId() {
		return this.stateId;
	}
	/**
	 * 设置创建人
	 */
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson == null ? null : createPerson.trim();
	}
	/**
	 * 获取创建人
	 */
	public String getCreatePerson() {
		return this.createPerson;
	}
	/**
	 * 设置创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取创建时间
	 */
	public Date getCreateDate() {
		return this.createDate;
	}
	/**
	 * 设置修改人
	 */
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson == null ? null : updatePerson.trim();
	}
	/**
	 * 获取修改人
	 */
	public String getUpdatePerson() {
		return this.updatePerson;
	}
	/**
	 * 设置修改时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取修改时间
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}
	/**
	 * 设置是否删除(0否/1是)
	 */
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/**
	 * 获取是否删除(0否/1是)
	 */
	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}
	/**
	 * 设置
	 */
	public void setCreateName(String createName) {
		this.createName = createName == null ? null : createName.trim();
	}
	/**
	 * 获取
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 设置
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName == null ? null : updateName.trim();
	}
	/**
	 * 获取
	 */
	public String getUpdateName() {
		return this.updateName;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Codetable{");
	    builder.append("codeId=");
	    builder.append(codeId);
	    builder.append(",");
	    builder.append("codeName=");
	    builder.append(codeName);
	    builder.append(",");
	    builder.append("stateId=");
	    builder.append(stateId);
	    builder.append(",");
	    builder.append("createPerson=");
	    builder.append(createPerson);
	    builder.append(",");
	    builder.append("createDate=");
	    builder.append(createDate);
	    builder.append(",");
	    builder.append("updatePerson=");
	    builder.append(updatePerson);
	    builder.append(",");
	    builder.append("updateDate=");
	    builder.append(updateDate);
	    builder.append(",");
	    builder.append("deleteFlag=");
	    builder.append(deleteFlag);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append("}");
	    return builder.toString();
	}

}

