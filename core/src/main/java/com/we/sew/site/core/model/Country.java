package com.we.sew.site.core.model;

import com.we.sew.site.core.Core;
import com.we.sew.site.core.model.abs.TimeEntityInfo;

import javax.persistence.*;

/**
 * @author Vladyslav_Yemelianov
 */
@Entity
@Table(name = Core.Country.TABLE_NAME)
public class Country extends TimeEntityInfo {
    @Id
    @Column(name = Core.Country.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = Core.Country.TITLE, nullable = false, unique = true)
    private String title;
    @Column(name = Core.Country.ABR, nullable = false, unique = true)
    private String abr;
    @Column(name = Core.Country.LOGO_PATH, nullable = false)
    private String logoPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (title != null ? !title.equals(country.title) : country.title != null) return false;
        if (abr != null ? !abr.equals(country.abr) : country.abr != null) return false;
        return logoPath != null ? logoPath.equals(country.logoPath) : country.logoPath == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (abr != null ? abr.hashCode() : 0);
        result = 31 * result + (logoPath != null ? logoPath.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append(super.toString());
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", abr='").append(abr).append('\'');
        sb.append(", logoPath='").append(logoPath).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
