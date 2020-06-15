package cn.itcast.pojo;

public class Traveller {
    private String id;
    private String name;
    private String sex;
    private String phoneNum;
    private Integer credentialsType;
    private String credentialsTypeStr;
    private String credentialsNum;
    private Integer travellerType;
    private String travellerTypeStr;

    public String getCredentialsTypeStr() {
        //证件类型 0身份证 1护照 2军官证
        if(credentialsType!=null) {
            if (credentialsType == 0) {
                credentialsTypeStr="身份证";
            }
            if (credentialsType == 1) {
                credentialsTypeStr="护照";
            }
            if (credentialsType == 2) {
                credentialsTypeStr="军官证";
            }
        }
        return credentialsTypeStr;
    }

    public String getTravellerTypeStr() {
        //旅客类型(人群) 0 成人 1 儿童
        if(travellerType!=null){
            if(travellerType==0){
                travellerTypeStr="儿童";
            }
            if(travellerType==1){
                travellerTypeStr="成人";
            }
        }
        return travellerTypeStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }
}