package com.we.sew.site.core.model;

import com.we.sew.site.core.Core;
import com.we.sew.site.core.model.abs.StatusedEntity;

import javax.persistence.*;

/**
 * @author Vladyslav_Yemelianov
 */
@Entity
@Table(name = Core.SiteUser.TABLE_NAME)
public class SiteUser extends StatusedEntity {
    @Id
    @Column(name = Core.SiteUser.ID, nullable = false)
    private String id;
    @Column(name = Core.SiteUser.EMAIL, nullable = false, unique = false)
    private String email;
    @Column(name = Core.SiteUser.PASSWORD, nullable = false)
    private String password;
    @Column(name = Core.SiteUser.FIRST_NAME, nullable = false)
    private String firstName;
    @Column(name = Core.SiteUser.LAST_NAME, nullable = false)
    private String lastName;
    @Column(name = Core.SiteUser.BIRTH_DATE)
    private long birthDate;
    @Column(name = Core.SiteUser.LAST_LOGIN)
    private long lastLogin;
    @ManyToOne
    @JoinColumn(name = Core.SiteUser.ROLE_ID)
    private UserRole userRole;
    @ManyToOne
    @JoinColumn(name = Core.SiteUser.ADDRESS_ID)
    private Address address;
    @Column(name = Core.SiteUser.CELL_NUMBER)
    private String cellNumber;
    @Column(name = Core.SiteUser.GENDER)
    private Gender gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SiteUser siteUser = (SiteUser) o;

        if (birthDate != siteUser.birthDate) return false;
        if (lastLogin != siteUser.lastLogin) return false;
        if (id != null ? !id.equals(siteUser.id) : siteUser.id != null) return false;
        if (email != null ? !email.equals(siteUser.email) : siteUser.email != null) return false;
        if (password != null ? !password.equals(siteUser.password) : siteUser.password != null) return false;
        if (firstName != null ? !firstName.equals(siteUser.firstName) : siteUser.firstName != null) return false;
        if (lastName != null ? !lastName.equals(siteUser.lastName) : siteUser.lastName != null) return false;
        if (userRole != null ? !userRole.equals(siteUser.userRole) : siteUser.userRole != null) return false;
        if (address != null ? !address.equals(siteUser.address) : siteUser.address != null) return false;
        if (cellNumber != null ? !cellNumber.equals(siteUser.cellNumber) : siteUser.cellNumber != null) return false;
        return gender == siteUser.gender;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (int) (birthDate ^ (birthDate >>> 32));
        result = 31 * result + (int) (lastLogin ^ (lastLogin >>> 32));
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (cellNumber != null ? cellNumber.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SiteUser{");
        sb.append(super.toString());
        sb.append("id='").append(id).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", userRole=").append(userRole);
        sb.append(", address=").append(address);
        sb.append(", cellNumber='").append(cellNumber).append('\'');
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
