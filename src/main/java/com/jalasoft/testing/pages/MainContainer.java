package com.jalasoft.testing.pages;

public class MainContainer extends AbstractBasePage {

    public Header goToHeader() {
        return new Header();
    }

    public TabBar goToTabBar() { return new TabBar(); }

    public Footer goToFooter() { return new Footer(); }

    // case all classes used by main container but in our case we will use only one.
    /*private Header header;
    private TabBar tabBar;
    private Footer footer;

    public MainContainer(){
        header = new Header();
        tabBar = new TabBar();
        footer = new Footer();
    }

    public Footer getFooter() {
        return footer;
    }

    public TabBar getTabBar() {
        return tabBar;
    }

    public Header getHeader() {
        return header;
    }*/
}
