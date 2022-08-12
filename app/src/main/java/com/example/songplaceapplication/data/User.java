package com.example.songplaceapplication.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    //@SerializedName(서버키이름) JSON으로 serialize 될 때 매칭 되는 이름을 명시하는 목적으로 사용되는
    // field 마킹 어노테이션
    //@Expose - object 중 해당 값이 null일 경우, json으로 만들 필드를 자동 생략

    @SerializedName("userId")
    @Expose
    private String userId;

    @SerializedName("userPw")
    @Expose
    private String userPw;

    @SerializedName("userName")
    @Expose
    private String userName;

    @SerializedName("localAgree")
    @Expose
    private int localAgree;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLocalAgree() {
        return localAgree;
    }

    public void setLocalAgree(int localAgree) {
        this.localAgree = localAgree;
    }

    public User(String userId, String userPw){
        this.userId = userId;
        this.userPw = userPw;
    }

}
