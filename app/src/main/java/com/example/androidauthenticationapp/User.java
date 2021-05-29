//package com.example.androidauthenticationapp;

//public class User {
//    private String username;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String telephone;
//    private String address;
//    private Boolean isAdmin;
//    private String createdBy;
//    private String updatedBy;
//    public static String token = "";
//
//    public User(String userName, String password) {
//        this.username = userName;
//        this.password = password;
//        this.firstName = userName;
//        this.lastName = userName;
//        this.email = userName + "@gmail.com";
//        this.telephone = "";
//        this.address = "";
//        this.isAdmin = false;
//        this.createdBy = userName;
//        this.updatedBy = userName;
//    }
//}

package com.example.androidauthenticationapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("isAdmin")
    @Expose
    private Boolean isAdmin;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("updatedBy")
    @Expose
    private String updatedBy;
    public static String token = "";
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;
        this.firstName = userName;
        this.lastName = userName;
        this.email = userName + "@gmail.com";
        this.telephone = "";
        this.address = "";
        this.isAdmin = false;
        this.createdBy = userName;
        this.updatedBy = userName;
    }

}

