        package com.example.androidauthenticationapp;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class PackageOrigin {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("originTrackingNumber")
    @Expose
    private String originTrackingNumber;
    @SerializedName("packageCode")
    @Expose
    private String packageCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("weight")
    @Expose
    private Double weight;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("isDelete")
    @Expose
    private Boolean isDelete;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("createdBy")
    @Expose
    private User createdBy;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("updatedBy")
    @Expose
    private User updatedBy;
    @SerializedName("owner")
    @Expose
    private Object owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginTrackingNumber() {
        return originTrackingNumber;
    }

    public void setOriginTrackingNumber(String originTrackingNumber) {
        this.originTrackingNumber = originTrackingNumber;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

}