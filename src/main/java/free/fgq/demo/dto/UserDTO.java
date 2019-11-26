package free.fgq.demo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: free.fgq.demo.dto
 * @ClassName: UserDTO
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/26 9:08
 */
public class UserDTO implements Serializable {

    private Long id;

    private String userName;

    private Date createBy;

    private String lowerName;

    private String name;

    private String fullName;

    private String email;

    private String passwd;

    private Integer loginType;

    private Long loginSource;

    private String loginName;

    private Integer type;

    private String location;

    private String website;

    private String rands;

    private String salt;

    private Long createdUnix;

    private Long updatedUnix;

    private Boolean lastRepoVisibility;

    private Integer maxRepoCreation;

    private Boolean isActive;

    private Boolean isAdmin;

    private Boolean allowGitHook;

    private Boolean allowImportLocal;

    private Boolean prohibitLogin;

    private String avatar;

    private String avatarEmail;

    private Boolean useCustomAvatar;

    private Integer numFollowers;

    private Integer numFollowing;

    private Integer numStars;

    private Integer numRepos;

    private String description;

    private Integer numTeams;

    private Integer numMembers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public String getLowerName() {
        return lowerName;
    }

    public void setLowerName(String lowerName) {
        this.lowerName = lowerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public Long getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(Long loginSource) {
        this.loginSource = loginSource;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Long getCreatedUnix() {
        return createdUnix;
    }

    public void setCreatedUnix(Long createdUnix) {
        this.createdUnix = createdUnix;
    }

    public Long getUpdatedUnix() {
        return updatedUnix;
    }

    public void setUpdatedUnix(Long updatedUnix) {
        this.updatedUnix = updatedUnix;
    }

    public Boolean getLastRepoVisibility() {
        return lastRepoVisibility;
    }

    public void setLastRepoVisibility(Boolean lastRepoVisibility) {
        this.lastRepoVisibility = lastRepoVisibility;
    }

    public Integer getMaxRepoCreation() {
        return maxRepoCreation;
    }

    public void setMaxRepoCreation(Integer maxRepoCreation) {
        this.maxRepoCreation = maxRepoCreation;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getAllowGitHook() {
        return allowGitHook;
    }

    public void setAllowGitHook(Boolean allowGitHook) {
        this.allowGitHook = allowGitHook;
    }

    public Boolean getAllowImportLocal() {
        return allowImportLocal;
    }

    public void setAllowImportLocal(Boolean allowImportLocal) {
        this.allowImportLocal = allowImportLocal;
    }

    public Boolean getProhibitLogin() {
        return prohibitLogin;
    }

    public void setProhibitLogin(Boolean prohibitLogin) {
        this.prohibitLogin = prohibitLogin;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarEmail() {
        return avatarEmail;
    }

    public void setAvatarEmail(String avatarEmail) {
        this.avatarEmail = avatarEmail;
    }

    public Boolean getUseCustomAvatar() {
        return useCustomAvatar;
    }

    public void setUseCustomAvatar(Boolean useCustomAvatar) {
        this.useCustomAvatar = useCustomAvatar;
    }

    public Integer getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(Integer numFollowers) {
        this.numFollowers = numFollowers;
    }

    public Integer getNumFollowing() {
        return numFollowing;
    }

    public void setNumFollowing(Integer numFollowing) {
        this.numFollowing = numFollowing;
    }

    public Integer getNumStars() {
        return numStars;
    }

    public void setNumStars(Integer numStars) {
        this.numStars = numStars;
    }

    public Integer getNumRepos() {
        return numRepos;
    }

    public void setNumRepos(Integer numRepos) {
        this.numRepos = numRepos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumTeams() {
        return numTeams;
    }

    public void setNumTeams(Integer numTeams) {
        this.numTeams = numTeams;
    }

    public Integer getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(Integer numMembers) {
        this.numMembers = numMembers;
    }
}
