package com.kms.smarttripadvisor.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "account_sequence"
    )
    public int id;
    @Column(name="fulname", columnDefinition = "VARCHAR(255)")
    public String fulname;
    @Column(name="link_avatar", columnDefinition = "VARCHAR(255)")
    public String linkAvatar;
    @Column(name="dob", columnDefinition = "DATE")
    public LocalDate dob;
    @Column(name="gender", columnDefinition = "BOOLEAN DEFAULT false")
    public boolean gender;
    @Column(name="link_facebook", columnDefinition = "VARCHAR(255)")
    public String linkFacebook;
    @Column(name="list_friend_id", columnDefinition = "VARCHAR(255)")
    public String listFriendId;
    @Column(name="date_up_vip", columnDefinition = "TIMESTAMP")
    public LocalDateTime dateUpVip;
    @Column(name="date_expiration", columnDefinition = "TIMESTAMP")
    public LocalDateTime dateExpiration;
    @Column(name="address", columnDefinition = "VARCHAR(255)")
    public String address;
    @Column(name="email", columnDefinition = "VARCHAR(255)")
    public String email;
    @Column(name="company_name", columnDefinition = "VARCHAR(255)")
    public String companyName;
    @Column(name="description", columnDefinition = "VARCHAR(255)")
    public String description;
    @Column(name="phone_number", columnDefinition = "VARCHAR(255)")
    public String phoneNumber;
    @Column(name="website", columnDefinition = "VARCHAR(255)")
    public String website;
    @Column(name = "unique_id", nullable = false, updatable = false)
    public String unique_id;
    @Column(name="username", columnDefinition = "VARCHAR(255)")
    public String username;
    @Column(name="password", columnDefinition = "VARCHAR(255)")
    public String password;
    @Column(name="type_account", columnDefinition = "VARCHAR(255)")
    public String typeAccount;
    @Column(name="is_delete", nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    public boolean isDelete;

    public Account(int id, String fulname, String linkAvatar, LocalDate dob, boolean gender, String linkFacebook, String listFriendId,
                   LocalDateTime dateUpVip, LocalDateTime dateExpiration, String address, String email, String companyName, String description,
                   String phoneNumber, String website, String unique_id, String username, String password, String typeAccount, boolean isDelete) {
        this.id = id;
        this.fulname = fulname;
        this.linkAvatar = linkAvatar;
        this.dob = dob;
        this.gender = gender;
        this.linkFacebook = linkFacebook;
        this.listFriendId = listFriendId;
        this.dateUpVip = dateUpVip;
        this.dateExpiration = dateExpiration;
        this.address = address;
        this.email = email;
        this.companyName = companyName;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.typeAccount = typeAccount;
        this.isDelete = isDelete;
    }

    public Account() {

    }
    //UserAccount
    public Account(int id, String fulname, String linkAvatar, LocalDate dob, boolean gender, String linkFacebook, String listFriendId, LocalDateTime dateUpVip, LocalDateTime dateExpiration, String address, String email, String unique_id, String username, String password, String typeAccount, boolean isDelete) {
        this.id = id;
        this.fulname = fulname;
        this.linkAvatar = linkAvatar;
        this.dob = dob;
        this.gender = gender;
        this.linkFacebook = linkFacebook;
        this.listFriendId = listFriendId;
        this.dateUpVip = dateUpVip;
        this.dateExpiration = dateExpiration;
        this.address = address;
        this.email = email;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.typeAccount = typeAccount;
        this.isDelete = isDelete;
    }
    //CompanyAccount
    public Account(String address, String email, String companyName, String description, String phoneNumber, String website, String unique_id, String username, String password, String typeAccount, boolean isDelete) {
        this.address = address;
        this.email = email;
        this.companyName = companyName;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.typeAccount = typeAccount;
        this.isDelete = isDelete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFulname(String fulname) {
        this.fulname = fulname;
    }

    public void setLinkAvatar(String linkAvatar) {
        this.linkAvatar = linkAvatar;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public void setListFriendId(String listFriendId) {
        this.listFriendId = listFriendId;
    }

    public void setDateUpVip(LocalDateTime dateUpVip) {
        this.dateUpVip = dateUpVip;
    }

    public void setDateExpiration(LocalDateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public int getId() {
        return id;
    }

    public String getFulname() {
        return fulname;
    }

    public String getLinkAvatar() {
        return linkAvatar;
    }

    public LocalDate getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public String getListFriendId() {
        return listFriendId;
    }

    public LocalDateTime getDateUpVip() {
        return dateUpVip;
    }

    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public boolean isDelete() {
        return isDelete;
    }
}
