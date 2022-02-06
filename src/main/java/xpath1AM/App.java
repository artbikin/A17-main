package xpath1AM;

public class App {
    public static void main(String[] args) {

        // xpath
        // //*[@data-purpose="header-signup"]
        // * is a wildcard, it could be anything
        // then [@attribute = "value"]

        // use function text() rather than attribute
        // //*[text()="Log in"]
        // MUST provide all inner text in this case

        // CONTAINS
        // //*[contains(text(),'broad')]

        // //*[contains(@class, 'headline udlite')]



        // child element from parent element
        // use / next element
        // //*[@data-purpose='header-login']/span

        // go to the parent element
        // //*[@data-purpose='header-login']/parent::*

        // sibling elements
        // on the same level
        // have the same parent
        // order is important
        // (//*[@href='/'])[3]/following-sibling::* for all siblings
        // (//*[@href='/'])[3]/following-sibling::nav for specific sibling
        // OR /preceding-sibling::nav to go back


    }
}
