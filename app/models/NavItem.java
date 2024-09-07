package models;

public class NavItem {
    private String name;
    private String link;

    // Construtor com parâmetros
    public NavItem(String name, String link) {
        this.name = name;
        this.link = link;
    }

    // Getter para 'name'
    public String getName() {
        return name;
    }

    // Getter para 'link'
    public String getLink() {
        return link;
    }

    // Construtor padrão (se necessário)
    public NavItem() {
    }
}