package com.practice;

public class LoginUserRequest {

    // membuat validation dengan anotasi.
    @NotBlank
    private String username;

    @NotBlank
    private String pwd;

    @NotBlank
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
