package merModel;

import java.io.Serializable;

/**
 * Description:
 *
 * @author: jhc
 * @create: 2017/6/1
 * @version: 1.0
 */
public class UserModel implements Serializable{
    private static final long serialVersionUID = -3291196087479862240L;

    private int id;
    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserModel [id=" + id + ", account=" + account + ", userName="
                + userName + ", password=" + password + ", modile=" + mobile
                + ", email=" + email + "]";
    }
}
