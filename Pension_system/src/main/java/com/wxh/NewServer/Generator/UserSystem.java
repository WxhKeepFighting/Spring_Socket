package com.wxh.NewServer.Generator;

import java.io.Serializable;

/**
 * user_system
 * @author 
 */
public class UserSystem implements Serializable {
    /**
     * 系统用户id
     */
    private String sId;

    /**
     * 系统用户密码
     */
    private String sPassword;

    /**
     * 系统角色id
     */
    private String roleId;

    private String active;

    private static final long serialVersionUID = 1L;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserSystem other = (UserSystem) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
            && (this.getsPassword() == null ? other.getsPassword() == null : this.getsPassword().equals(other.getsPassword()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsPassword() == null) ? 0 : getsPassword().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sPassword=").append(sPassword);
        sb.append(", roleId=").append(roleId);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}