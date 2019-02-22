package vn.teo.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties
@Validated
public class GlobalConfig {

    @NotEmpty
    private String name;
    private String website;
    private String facebook;
    private List<MenuConfig.Menu> menus = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public List<MenuConfig.Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuConfig.Menu> menus) {
        this.menus = menus;
    }
}
